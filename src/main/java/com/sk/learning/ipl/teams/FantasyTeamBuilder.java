package com.sk.learning.ipl.teams;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FantasyTeamBuilder {
	
	public static FantasyTeam getAmitFantasyTeam() {
		Integer captainId = 164;
		Integer viceCaptainId = 1154;
		Map<Integer, Integer> dream11 = new LinkedHashMap<Integer, Integer>();
		dream11.put(164, 0);
		dream11.put(1154, 0);
		dream11.put(1, 0);
		dream11.put(116, 0);
		dream11.put(8, 0);
		dream11.put(261, 0);
		dream11.put(2740, 0);
		dream11.put(203, 0);
		dream11.put(84, 0);
		dream11.put(107, 0);
		dream11.put(25, 0);
		
		return new FantasyTeam("AMIT", dream11, captainId, viceCaptainId);
	}
	
	public static FantasyTeam getAnkitFantasyTeam() {
		Integer captainId = 164;
		Integer viceCaptainId = 233;

		Map<Integer, Integer> dream11 = new LinkedHashMap<Integer, Integer>();
		dream11.put(164, 0);
		dream11.put(233, 0);
		dream11.put(1, 0);
		dream11.put(116, 0);
		dream11.put(1124, 0);
		dream11.put(8, 0);
		dream11.put(227, 0);
		dream11.put(25, 0);
		dream11.put(1154, 0);
		dream11.put(84, 0);
		dream11.put(102, 0);

		return new FantasyTeam("ANKIT", dream11, captainId, viceCaptainId);
	}
	
	public static FantasyTeam getAyushiFantasyTeam() {
		Integer captainId = 1;
		Integer viceCaptainId = 2164;

		Map<Integer, Integer> dream11 = new LinkedHashMap<Integer, Integer>();
		dream11.put(1, 0);
		dream11.put(164, 0);
		dream11.put(116, 0);
		dream11.put(203, 0);
		dream11.put(8, 0);
		dream11.put(210, 0);
		dream11.put(25, 0);
		dream11.put(181, 0);
		dream11.put(177, 0);
		dream11.put(233, 0);
		dream11.put(135, 0);

		return new FantasyTeam("AYUSHI", dream11, captainId, viceCaptainId);
	}
	
	public static FantasyTeam getGiriFantasyTeam() {
		Integer captainId = 164;
		Integer viceCaptainId = 1154;

		Map<Integer, Integer> dream11 = new LinkedHashMap<Integer, Integer>();
		dream11.put(164, 0);
		dream11.put(1154, 0);
		dream11.put(1125, 0);
		dream11.put(116, 0);
		dream11.put(1124, 0);
		dream11.put(203, 0);
		dream11.put(227, 0);
		dream11.put(233, 0);
		dream11.put(84, 0);
		dream11.put(41, 0);
		dream11.put(107, 0);

		return new FantasyTeam("GIRI", dream11, captainId, viceCaptainId);
	}
	
	public static FantasyTeam getKarthikFantasyTeam() {
		Integer captainId = 233;
		Integer viceCaptainId = 107;

		Map<Integer, Integer> dream11 = new LinkedHashMap<Integer, Integer>();
		dream11.put(233, 0);
		dream11.put(107, 0);
		dream11.put(127, 0);
		dream11.put(1124, 0);
		dream11.put(86, 0);
//		dream11.put(0, 0);
		dream11.put(30, 0);
		dream11.put(100, 0);
		dream11.put(202, 0);
		dream11.put(123, 0);
		dream11.put(236, 0);

		return new FantasyTeam("KARTHIk", dream11, captainId, viceCaptainId);
	}
	
	public static FantasyTeam getKaushikFantasyTeam() {
		Integer captainId = 164;
		Integer viceCaptainId = 123;

		Map<Integer, Integer> dream11 = new LinkedHashMap<Integer, Integer>();
		dream11.put(164, 0);
		dream11.put(123, 0);
		dream11.put(16, 0);
		dream11.put(76, 0);
		dream11.put(203, 0);
		dream11.put(59, 0);
		dream11.put(25, 0);
		dream11.put(210, 0);
		dream11.put(282, 0);
		dream11.put(127, 0);
		dream11.put(276, 0);

		return new FantasyTeam("KAUSHIK", dream11, captainId, viceCaptainId);
	}
	
	public static FantasyTeam getSantoshFantasyTeam() {
		Integer captainId = 164;
		Integer viceCaptainId = 233;

		Map<Integer, Integer> dream11 = new LinkedHashMap<Integer, Integer>();
		dream11.put(164, 0);
		dream11.put(233, 0);
		dream11.put(102, 0);
		dream11.put(1124, 0);
		dream11.put(116, 0);
		dream11.put(2885, 0);
		dream11.put(1154, 0);
		dream11.put(227, 0);
		dream11.put(25, 0);
		dream11.put(84, 0);
		dream11.put(1125, 0);

		return new FantasyTeam("SANTOSH", dream11, captainId, viceCaptainId);
	}
	
	public static FantasyTeam getShashankFantasyTeam() {
		Integer captainId = 164;
		Integer viceCaptainId = 107;

		Map<Integer, Integer> dream11 = new LinkedHashMap<Integer, Integer>();
		dream11.put(164, 0);
		dream11.put(107, 0);
		dream11.put(1, 0);
		dream11.put(203, 0);
		dream11.put(116, 0);
		dream11.put(135, 0);
		dream11.put(25, 0);
		dream11.put(1113, 0);
		dream11.put(233, 0);
		dream11.put(84, 0);
		dream11.put(1124, 0);

		return new FantasyTeam("SHASHANK", dream11, captainId, viceCaptainId);
	}
	
	public static FantasyTeam getVamsiFantasyTeam() {
		Integer captainId = 164;
		Integer viceCaptainId = 1154;

		Map<Integer, Integer> dream11 = new LinkedHashMap<Integer, Integer>();
		dream11.put(164, 0);
		dream11.put(1154, 0);
		dream11.put(1125, 0);
		dream11.put(2885, 0);
		dream11.put(1124, 0);
		dream11.put(116, 0);
		dream11.put(177, 0);
		dream11.put(836, 0);
		dream11.put(41, 0);
		dream11.put(2756, 0);
		dream11.put(233, 0);

		return new FantasyTeam("VAMSI", dream11, captainId, viceCaptainId);
	}


}
