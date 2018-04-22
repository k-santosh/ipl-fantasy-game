package com.sk.learning.ipl.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.sk.learning.ipl.model.Player;

public class TeamsInfo {
	
	public static void main(String[] args) throws JSONException {
		TeamsInfo teamInfo = new TeamsInfo();
		teamInfo.getAllPlayers("");
	}
	
	public Map<Integer, Player> getAllPlayers(String playerOfMatch) throws JSONException {
		String cskSquadUrl = "https://cricketapi.platform.iplt20.com/tournaments/7749/squads/1?matchTypes=ALL";
		String ddSquadUrl = "https://cricketapi.platform.iplt20.com/tournaments/7749/squads/3?matchTypes=ALL";
		String kingsXISquadUrl = "https://cricketapi.platform.iplt20.com/tournaments/7749/squads/4?matchTypes=ALL";
		String kkrSquadUrl = "https://cricketapi.platform.iplt20.com/tournaments/7749/squads/5?matchTypes=ALL";
		String miSquadUrl = "https://cricketapi.platform.iplt20.com/tournaments/7749/squads/6?matchTypes=ALL";
		String rrSquadUrl = "https://cricketapi.platform.iplt20.com/tournaments/7749/squads/8?matchTypes=ALL";
		String rcbSquadUrl = "https://cricketapi.platform.iplt20.com/tournaments/7749/squads/9?matchTypes=ALL";
		String srhSqualUrl = "https://cricketapi.platform.iplt20.com/tournaments/7749/squads/62?matchTypes=ALL";
		
		List<String> teamSquad = new ArrayList<String>();
		teamSquad.add(cskSquadUrl);
		teamSquad.add(ddSquadUrl);
		teamSquad.add(kingsXISquadUrl);
		teamSquad.add(kkrSquadUrl);
		teamSquad.add(miSquadUrl);
		teamSquad.add(rrSquadUrl);
		teamSquad.add(rcbSquadUrl);
		teamSquad.add(srhSqualUrl);
		
		String teamDetail;
		RestClientApi restApi = new RestClientApi();
		Map<Integer, Player> playerIds = new HashMap<Integer, Player>();
		for (String teamUrl : teamSquad) {
			teamDetail = restApi.hitRestApi(teamUrl);
			parseTeamSquad(teamDetail, playerIds, playerOfMatch);
//			System.out.println();
		}
		return playerIds;
	}
	
	public void parseTeamSquad(String teamDetail, Map<Integer, Player> playerIds, String playerOfMatch) throws JSONException {
		JSONObject teamObj = new JSONObject(teamDetail);
//		System.out.println("Team : "+ teamObj.getJSONObject("ALL").getJSONObject("team").getString("fullName").toUpperCase());
		JSONArray playerArr = teamObj.getJSONObject("ALL").getJSONArray("players");
		for (int i=0; i< playerArr.length(); i++) {
			Integer id = playerArr.getJSONObject(i).getInt("id");
			String playerName = playerArr.getJSONObject(i).getString("fullName");
//			System.out.println(id + "  " + playerName);
			if(playerOfMatch.equalsIgnoreCase(playerName)) {
				playerIds.put(id, new Player(id, playerName, true));
			} else {
				playerIds.put(id ,new Player(id, playerName));
			}
		}
	}

}
