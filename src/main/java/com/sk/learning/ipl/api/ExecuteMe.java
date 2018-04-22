package com.sk.learning.ipl.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import com.sk.learning.ipl.teams.FantasyTeamBuilder;

public class ExecuteMe {
	
	public static void main(String[] args) throws JSONException {
		RestClientApi restApiClient = new RestClientApi();
		ScoreCalculation scoreCal = new ScoreCalculation();
		
		List<String> restUrls = new ArrayList<String>();
		restUrls.add("https://cricketapi.platform.iplt20.com//fixtures/7909/scoring");
		restUrls.add("https://cricketapi.platform.iplt20.com//fixtures/7910/scoring");
		
		for (String url : restUrls) {
			System.out.println("************* MATCH "+ url + " *************************");
			String output = restApiClient.hitRestApi(url);
			JSONObject outputObj = new JSONObject(output);
			
			scoreCal.getPlayersScore(outputObj);
			
			scoreCal.calculateFantsyTeamScore(FantasyTeamBuilder.getAmitFantasyTeam());
			scoreCal.calculateFantsyTeamScore(FantasyTeamBuilder.getAnkitFantasyTeam());
			scoreCal.calculateFantsyTeamScore(FantasyTeamBuilder.getAyushiFantasyTeam());
			scoreCal.calculateFantsyTeamScore(FantasyTeamBuilder.getGiriFantasyTeam());
			scoreCal.calculateFantsyTeamScore(FantasyTeamBuilder.getKarthikFantasyTeam());
			scoreCal.calculateFantsyTeamScore(FantasyTeamBuilder.getKaushikFantasyTeam());
			scoreCal.calculateFantsyTeamScore(FantasyTeamBuilder.getSantoshFantasyTeam());
			scoreCal.calculateFantsyTeamScore(FantasyTeamBuilder.getShashankFantasyTeam());
			scoreCal.calculateFantsyTeamScore(FantasyTeamBuilder.getVamsiFantasyTeam());
			
			System.out.println("********************************************************"+ "\n");
		}
		
		
	}

}
