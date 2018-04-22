package com.sk.learning.ipl.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.sk.learning.ipl.model.Player;
import com.sk.learning.ipl.teams.AmitDream11;
import com.sk.learning.ipl.teams.AnkitDream11;
import com.sk.learning.ipl.teams.AyushiDream11;
import com.sk.learning.ipl.teams.FantasyTeam;
import com.sk.learning.ipl.teams.GiriDream11;
import com.sk.learning.ipl.teams.KarthikDream11;
import com.sk.learning.ipl.teams.KaushikDream11;
import com.sk.learning.ipl.teams.SantoshDream11;
import com.sk.learning.ipl.teams.ShashankDream11;
import com.sk.learning.ipl.teams.VamsiDream11;

public class ScoreCalculation {
	private static RestClientApi restApiClient;
	private static TeamsInfo teamInfo;
	private static Map<Integer, Player> idsAndPlayers;
	
	public ScoreCalculation() {
		restApiClient = new RestClientApi();
		teamInfo = new TeamsInfo();
	}
	
	public void getPlayersScore(JSONObject outputObj) throws JSONException {
		JSONObject matchInfoObj =  outputObj.getJSONObject("matchInfo");
		String playerOfTheMatch = matchInfoObj.getJSONObject("additionalInfo").getString("result.playerofthematch");
		System.out.println("Player of the Match : " + playerOfTheMatch);
		
		idsAndPlayers = teamInfo.getAllPlayers(playerOfTheMatch);
		
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
			calculateBattingScore(currentPlayer, runs);
		}
		
		for (int i = 0; i < firstInnBowling.length(); i++) {
			JSONObject playerBowlingStat = firstInnBowling.getJSONObject(i);
			Integer id = playerBowlingStat.getInt("playerId");
			Player currentPlayer = idsAndPlayers.get(id);
			int wickets = playerBowlingStat.getInt("w");
			currentPlayer.setWickets(wickets);
			calculateBowlingScore(currentPlayer, wickets);
		}
		
		JSONArray secondInnBatting = secondInning.getJSONArray("battingStats");
		JSONArray secondInnBowling = secondInning.getJSONArray("bowlingStats");
		
		for (int i = 0; i < secondInnBatting.length(); i++) {
			JSONObject playerBattingStat = secondInnBatting.getJSONObject(i);
			Integer id = playerBattingStat.getInt("playerId");
			Player currentPlayer = idsAndPlayers.get(id);
			int runs = playerBattingStat.getInt("r");
			currentPlayer.setRuns(runs);
			calculateBattingScore(currentPlayer, runs);
		}
		
		for (int i = 0; i < secondInnBowling.length(); i++) {
			JSONObject playerBowlingStat = secondInnBowling.getJSONObject(i);
			Integer id = playerBowlingStat.getInt("playerId");
			Player currentPlayer = idsAndPlayers.get(id);
			int wickets = playerBowlingStat.getInt("w");
			currentPlayer.setWickets(wickets);
			calculateBowlingScore(currentPlayer, wickets);
		}
	}
	
	public void calculateBattingScore(Player player, Integer runs) {
		int scores = 0;
		if(runs <30) {
			scores = runs;
		} else if(runs>=30 && runs<50) {
			scores = runs + 15;
		} else if(runs>=50 && runs<100) {
			scores = runs + 25;
		} else if (runs >=100) {
			scores = runs + 50;
		}
		if(player.getScore() != null) {
			player.setScore(player.getScore()+ scores);
		} else {
			player.setScore(scores);
		}
	}
	
	public void calculateBowlingScore(Player player, Integer wickets) {
		int scores = 0;
		if(wickets <3) {
			scores = wickets*10;
		} else if(wickets==30) {
			scores = wickets*10 + 30;
		} else if(wickets==4) {
			scores = wickets*10 + 50;
		} else if (wickets >=5) {
			scores = wickets*10 + 100;
		}
		if(player.getScore() != null) {
			player.setScore(player.getScore()+ scores);
		} else {
			player.setScore(scores);
		}
	}
	
	public void calculateFantsyTeamScore(FantasyTeam fantasyTeam) {
		String format = "%-10s%-20s%s%n";
		Map<Integer, Integer> teamMembers = fantasyTeam.getDream11();
		System.out.printf(format, "Id", "Name", "Score");
		System.out.println("========== " + fantasyTeam.getTeamOwner()+ "'s Score calculation STARTED ==========");
		for (Entry<Integer, Integer> entry : teamMembers.entrySet()) {
			Integer playerId = entry.getKey();
			Player player = idsAndPlayers.get(playerId);
//			System.out.println("Player id : " + playerId + " Capt Id : " + fantasyTeam.getCaptainId() + " vice Cap : "+ fantasyTeam.getViceCaptainId());
			if(playerId.equals(fantasyTeam.getCaptainId())) {
				entry.setValue((player.getScore() != null) ? (player.getScore()*2): null);
			} else if(playerId.equals(fantasyTeam.getViceCaptainId())) {
				
				entry.setValue((player.getScore() != null) ? (int) (player.getScore()*1.5): null);
			} else {
				entry.setValue((player.getScore() != null) ? player.getScore(): null);
			}
			System.out.printf(format, entry.getKey(), player.getFullName(), entry.getValue());
		}
		System.out.println("========== " + fantasyTeam.getTeamOwner()+ "'s Score calculation FINISHED ==========\n");
	}
	
}
