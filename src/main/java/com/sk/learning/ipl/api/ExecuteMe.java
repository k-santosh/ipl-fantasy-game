package com.sk.learning.ipl.api;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.json.JSONException;
import org.json.JSONObject;

import com.sk.learning.ipl.teams.FantasyTeam;
import com.sk.learning.ipl.teams.FantasyTeamBuilder;

public class ExecuteMe {
	
	public static void main(String[] args) throws JSONException, FileNotFoundException, UnsupportedEncodingException {
		RestClientApi restApiClient = new RestClientApi();
		ScoreCalculation scoreCal = new ScoreCalculation();
		
		List<String> restUrls = new ArrayList<String>();
		
//		for(int i = 7894; i<=7915; i++) {
//			restUrls.add("https://cricketapi.platform.iplt20.com//fixtures/" + i + "/scoring");
//		}
		
		restUrls.add("https://cricketapi.platform.iplt20.com//fixtures/7916/scoring");
		
		List<FantasyTeam> listOfTeam = new ArrayList<FantasyTeam>();
		listOfTeam.add(FantasyTeamBuilder.getAmitFantasyTeam());
		listOfTeam.add(FantasyTeamBuilder.getAnkitFantasyTeam());
		listOfTeam.add(FantasyTeamBuilder.getAyushiFantasyTeam());
		listOfTeam.add(FantasyTeamBuilder.getGiriFantasyTeam());
		listOfTeam.add(FantasyTeamBuilder.getKarthikFantasyTeam());
		listOfTeam.add(FantasyTeamBuilder.getKaushikFantasyTeam());
		listOfTeam.add(FantasyTeamBuilder.getSantoshFantasyTeam());
		listOfTeam.add(FantasyTeamBuilder.getShashankFantasyTeam());
		listOfTeam.add(FantasyTeamBuilder.getVamsiFantasyTeam());
		
		Map<String, String> jsonMapTeamScore = new LinkedHashMap<String, String>();
		for (int j=0; j<restUrls.size(); j++) {
			System.out.println("************* MATCH STARTED " + restUrls.get(j) + "  ********************************************************************************");
			String output = restApiClient.hitRestApi(restUrls.get(j));
			JSONObject outputObj = new JSONObject(output);
			outputObj.getJSONObject("matchInfo");
			String team1 = "";
			String team2 = "";
			try {
				String matchLink = outputObj.getJSONObject("matchInfo").getJSONObject("additionalInfo")
						.getString("report.link");
				matchLink = matchLink.toUpperCase();
				String[] teamUrl = matchLink.split("-");
//				team1 = teamUrl[teamUrl.length -3];
//				team2 = teamUrl[teamUrl.length -1];
				System.out.println("MATCH LINK " + matchLink.toUpperCase() + " Team1 : "+ team1 + " Team2 : "+ team2);
			} catch (Exception e) {
				System.out.println("Could not find MATCH LINK " + e.getLocalizedMessage());
			}
			scoreCal.getPlayersScore(team1, team2, outputObj);
			
			for (int i = 0; i < listOfTeam.size(); i++) {
				String owner = listOfTeam.get(i).getTeamOwner();
				
				if(j==0) {
					jsonMapTeamScore.put(owner, "{ \n \""+ owner + "\": [\n");
				}
				String jsonStr = jsonMapTeamScore.get(owner);
				jsonStr = jsonStr + scoreCal.calculateFantsyTeamScore(listOfTeam.get(i)) + ",";
				jsonMapTeamScore.put(owner, jsonStr);
				
				if(j==restUrls.size()-1) {
					jsonMapTeamScore.put(owner, jsonStr.substring(0, jsonStr.length()-1) + "]}\n");
				}
					
			}
			
//			scoreCal.calculateFantsyTeamScore(FantasyTeamBuilder.getAnkitFantasyTeam());
//			scoreCal.calculateFantsyTeamScore(FantasyTeamBuilder.getAyushiFantasyTeam());
//			scoreCal.calculateFantsyTeamScore(FantasyTeamBuilder.getGiriFantasyTeam());
//			scoreCal.calculateFantsyTeamScore(FantasyTeamBuilder.getKarthikFantasyTeam());
//			scoreCal.calculateFantsyTeamScore(FantasyTeamBuilder.getKaushikFantasyTeam());
//			scoreCal.calculateFantsyTeamScore(FantasyTeamBuilder.getSantoshFantasyTeam());
//			scoreCal.calculateFantsyTeamScore(FantasyTeamBuilder.getShashankFantasyTeam());
//			scoreCal.calculateFantsyTeamScore(FantasyTeamBuilder.getVamsiFantasyTeam());
			
//			System.out.println("****************************************************************************************************************"+ "\n");
		}
		for (Entry<String, String> jsonMap : jsonMapTeamScore.entrySet()) {
//			System.out.println(jsonMap.getKey() + ":: ====================================\n" + jsonMap.getValue() );
			
			PrintWriter writer = new PrintWriter("src/main/resources/" + jsonMap.getKey().toLowerCase() +".json", "UTF-8");
			writer.println(jsonMap.getValue());
			writer.close();
		}
	}

}
