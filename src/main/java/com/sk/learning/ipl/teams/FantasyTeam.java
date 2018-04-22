package com.sk.learning.ipl.teams;

import java.util.LinkedHashMap;
import java.util.Map;

public class FantasyTeam {
	private String teamOwner;
	private Map<Integer, Integer> dream11;
	private Integer captainId;
	private Integer viceCaptainId;
	
	public FantasyTeam (String owner, Map<Integer, Integer> dream11, Integer captainId, Integer viceCaptainId) {
		this.teamOwner = owner;
		this.dream11 = dream11;
		this.captainId = captainId;
		this.viceCaptainId = viceCaptainId;
	}

	public String getTeamOwner() {
		return teamOwner;
	}

	public void setTeamOwner(String teamOwner) {
		this.teamOwner = teamOwner;
	}

	public Map<Integer, Integer> getDream11() {
		return dream11;
	}

	public void setDream11(Map<Integer, Integer> dream11) {
		this.dream11 = dream11;
	}

	public Integer getCaptainId() {
		return captainId;
	}

	public void setCaptainId(Integer captainId) {
		this.captainId = captainId;
	}

	public Integer getViceCaptainId() {
		return viceCaptainId;
	}

	public void setViceCaptainId(Integer viceCaptainId) {
		this.viceCaptainId = viceCaptainId;
	}
	
}
