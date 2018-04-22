package com.sk.learning.ipl.api;

import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.sk.learning.ipl.model.Player;

public class TemporaryClass {
/*	public static void main(String[] args) throws JSONException {
		RestClientApi restApiClient = new RestClientApi();
		TeamsInfo teamInfo = new TeamsInfo();
		ScoreCalculation scoreCal = new ScoreCalculation();
		Map<Integer, Player> idsAndPlayers = teamInfo.getAllPlayers();
		String output = restApiClient.hitRestApi("https://cricketapi.platform.iplt20.com//fixtures/7896/scoring");
//		System.out.println("Output : "+ output);
		JSONObject outputObj = new JSONObject(output);
		
		JSONObject matchInfoObj =  outputObj.getJSONObject("matchInfo");
		playerOfTheMatch = matchInfoObj.getJSONObject("additionalInfo").getString("result.playerofthematch");
		
//		JSONArray teamsArr =  matchInfoObj.getJSONArray("teams");
//		
//		JSONArray team1PlayersArr =  teamsArr.getJSONObject(0).getJSONArray("players");
//		JSONArray team2PlayersArr =  teamsArr.getJSONObject(1).getJSONArray("players");
//		
//		Map<Integer, Player> team1 = new HashMap<Integer, Player>();
//		Map<Integer, Player> team2 = new HashMap<Integer, Player>();
//		
//		Map<String, Integer> mapOfPlayerAndId1 = new HashMap<String, Integer>();
//		
//		for (int i = 0; i < team1PlayersArr.length(); i++) {
//			JSONObject playerObj = team1PlayersArr.getJSONObject(i);
//			mapOfPlayerAndId1.put(playerObj.getString("fullName"), playerObj.getInt("id"));
//			team1.put(playerObj.getInt("id") ,new Player(playerObj.getInt("id"), playerObj.getString("fullName")));
//		}
//		
//		Map<String, Integer> mapOfPlayerAndId2 = new HashMap<String, Integer>();
//		
//		for (int i = 0; i < team2PlayersArr.length(); i++) {
//			JSONObject playerObj = team2PlayersArr.getJSONObject(i);
//			mapOfPlayerAndId2.put(playerObj.getString("fullName"), playerObj.getInt("id"));
//			team2.put(playerObj.getInt("id") ,new Player(playerObj.getInt("id"), playerObj.getString("fullName")));
//		}
		
//		for (Entry<String, Integer> player : mapOfPlayerAndId1.entrySet()) {
//			System.out.println("Name : " + player.getKey() + " id : "+ player.getValue());
//		}
//		System.out.println();
//		for (Entry<String, Integer> player : mapOfPlayerAndId2.entrySet()) {
//			System.out.println("Name : " + player.getKey() + " id : "+ player.getValue());
//		}
		
		JSONArray inningsArr =  outputObj.getJSONArray("innings");
		
		JSONObject firstInning = inningsArr.getJSONObject(0).getJSONObject("scorecard");
		JSONObject secondInning = inningsArr.getJSONObject(1).getJSONObject("scorecard");
		
		JSONArray firstInnBatting = firstInning.getJSONArray("battingStats");
		JSONArray firstInnBowling = firstInning.getJSONArray("bowlingStats");
		
		for (int i = 0; i < firstInnBatting.length(); i++) {
			JSONObject playerBattingStat = firstInnBatting.getJSONObject(i);
			Integer id = playerBattingStat.getInt("playerId");
			Player currentPlayer = idsAndPlayers.get(id);
			int runs = playerBattingStat.getInt("r");
			currentPlayer.setRuns(runs);
			scoreCal.calculateBattingScore(currentPlayer, runs);
//			if(team1.containsKey(id)) {
//				Player player = team1.get(id);
//				player.setRuns(playerBattingStat.getInt("r"));
//			} else {
//				Player player = team2.get(id);
//				player.setRuns(playerBattingStat.getInt("r"));
//			}
			
		}
		
		for (int i = 0; i < firstInnBowling.length(); i++) {
			JSONObject playerBowlingStat = firstInnBowling.getJSONObject(i);
			Integer id = playerBowlingStat.getInt("playerId");
			Player currentPlayer = idsAndPlayers.get(id);
			int wickets = playerBowlingStat.getInt("w");
			currentPlayer.setWickets(wickets);
			scoreCal.calculateBowlingScore(currentPlayer, wickets);
//			if(team1.containsKey(id)) {
//				Player player = team1.get(id);
//				player.setWickets(playerBowlingStat.getInt("w"));
//			} else {
//				Player player = team2.get(id);
//				player.setWickets(playerBowlingStat.getInt("w"));
//			}
		}
		
		JSONArray secondInnBatting = secondInning.getJSONArray("battingStats");
		JSONArray secondInnBowling = secondInning.getJSONArray("bowlingStats");
		
		for (int i = 0; i < secondInnBatting.length(); i++) {
			JSONObject playerBattingStat = secondInnBatting.getJSONObject(i);
			Integer id = playerBattingStat.getInt("playerId");
			Player currentPlayer = idsAndPlayers.get(id);
			int runs = playerBattingStat.getInt("r");
			currentPlayer.setRuns(runs);
			scoreCal.calculateBattingScore(currentPlayer, runs);
//			if(team1.containsKey(id)) {
//				Player player = team1.get(id);
//				player.setRuns(playerBattingStat.getInt("r"));
//			} else {
//				Player player = team2.get(id);
//				player.setRuns(playerBattingStat.getInt("r"));
//			}
		}
		
		for (int i = 0; i < secondInnBowling.length(); i++) {
			JSONObject playerBowlingStat = secondInnBowling.getJSONObject(i);
			Integer id = playerBowlingStat.getInt("playerId");
			Player currentPlayer = idsAndPlayers.get(id);
			int wickets = playerBowlingStat.getInt("w");
			currentPlayer.setWickets(wickets);
			scoreCal.calculateBowlingScore(currentPlayer, wickets);
//			if(team1.containsKey(id)) {
//				Player player = team1.get(id);
//				player.setWickets(playerBowlingStat.getInt("w"));
//			} else {
//				Player player = team2.get(id);
//				player.setWickets(playerBowlingStat.getInt("w"));
//			}
		}
		
//		for (Entry<Integer, Player> player : team1.entrySet()) {
//			System.out.println(player.getValue().toString());
//		}
//		System.out.println();
//		for (Entry<Integer, Player> player : team2.entrySet()) {
//			System.out.println(player.getValue().toString());
//		}
//		calculateScore(mapOfPlayerAndId1, mapOfPlayerAndId2, team1, team2);
	}*/

}
