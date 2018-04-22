package com.sk.learning.ipl.model;

/**
 * @author SantoshKumar
 *
 */
public class Player {
	
	private Integer id;
	private String fullName;
	private Integer runs;
	private Integer wickets;
	private boolean playerOfMatch;
	private Integer score;
	
	public Player(Integer id, String fullName) {
		this.id = id;
		this.fullName = fullName;
		this.runs = 0;
		this.wickets = 0;
		this.playerOfMatch = false;
		this.score = null;
	}
	public Player(Integer id, String fullName, boolean playerOfMatch) {
		this.id = id;
		this.fullName = fullName;
		this.runs = 0;
		this.wickets = 0;
		this.playerOfMatch = playerOfMatch;
		this.score = 25;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRuns() {
		return runs;
	}
	public void setRuns(Integer runs) {
		this.runs = runs;
	}
	public Integer getWickets() {
		return wickets;
	}
	public void setWickets(Integer wickets) {
		this.wickets = wickets;
	}

	public boolean isPlayerOfMatch() {
		return playerOfMatch;
	}

	public void setPlayerOfMatch(boolean playerOfMatch) {
		this.playerOfMatch = playerOfMatch;
	}

	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", fullName=" + fullName + ", runs=" + runs + ", wickets=" + wickets
				+ ", playerOfMatch=" + playerOfMatch + ", score=" + score + "]";
//		return "Player [fullName=" + fullName + ", runs=" + runs + ", wickets=" + wickets
//				+ ", playerOfMatch=" + playerOfMatch + ", score=" + score + "]";
	}

}
