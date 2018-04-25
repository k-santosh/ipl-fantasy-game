package com.sk.learning.ipl.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.sk.learning.ipl.model.Player;

public class TeamsInfo {
	
	private static final String CSK = "https://cricketapi.platform.iplt20.com/tournaments/7749/squads/1?matchTypes=ALL";
	private static final String DD = "https://cricketapi.platform.iplt20.com/tournaments/7749/squads/3?matchTypes=ALL";
	private static final String KXIP = "https://cricketapi.platform.iplt20.com/tournaments/7749/squads/4?matchTypes=ALL";
	private static final String KKR = "https://cricketapi.platform.iplt20.com/tournaments/7749/squads/5?matchTypes=ALL";
	private static final String MI = "https://cricketapi.platform.iplt20.com/tournaments/7749/squads/6?matchTypes=ALL";
	private static final String RR = "https://cricketapi.platform.iplt20.com/tournaments/7749/squads/8?matchTypes=ALL";
	private static final String RCB = "https://cricketapi.platform.iplt20.com/tournaments/7749/squads/9?matchTypes=ALL";
	private static final String SRH = "https://cricketapi.platform.iplt20.com/tournaments/7749/squads/62?matchTypes=ALL";
	
	private static Map<String, String> teamsSquadUrl;
	public TeamsInfo() {
		teamsSquadUrl = new HashMap<String, String>();
		teamsSquadUrl.put("CSK", CSK);
		teamsSquadUrl.put("DD", DD);
		teamsSquadUrl.put("KXIP", KXIP);
		teamsSquadUrl.put("KKR", KKR);
		teamsSquadUrl.put("MI", MI);
		teamsSquadUrl.put("RR", RR);
		teamsSquadUrl.put("RCB", RCB);
		teamsSquadUrl.put("SRH", SRH);
		
		
	}
	public static void main(String[] args) throws JSONException {
		TeamsInfo teamInfo = new TeamsInfo();
		teamInfo.getAllPlayers("", "", "");
	}
	
	public Map<Integer, Player> getAllPlayers(String team1, String team2, String playerOfMatch) throws JSONException {
		List<String> teamSquad = new ArrayList<String>();
		if (StringUtils.isBlank(team1) || StringUtils.isBlank(team2)) {
			teamSquad.add(CSK);
			teamSquad.add(DD);
			teamSquad.add(KXIP);
			teamSquad.add(KKR);
			teamSquad.add(MI);
			teamSquad.add(RR);
			teamSquad.add(RCB);
			teamSquad.add(SRH);
		} else {
			teamSquad.add(teamsSquadUrl.get(team1));
			teamSquad.add(teamsSquadUrl.get(team2));
		}
		String teamDetail;
		RestClientApi restApi = new RestClientApi();
		Map<Integer, Player> playerIds = new HashMap<Integer, Player>();
		/*
		 * This is because Pat Cummins is not playing this IPL
		 */
		playerIds.put(0, new Player(0, "Pat Cummins"));
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
