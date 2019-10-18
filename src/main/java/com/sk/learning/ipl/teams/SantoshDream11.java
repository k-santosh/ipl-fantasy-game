package com.sk.learning.ipl.teams;

import java.util.HashMap;
import java.util.Map;

public class SantoshDream11 {
	
	private Map<Integer, Integer> dream11;
	private Integer captainId = 164;
	private Integer viceCaptainId = 233;
	
	public SantoshDream11 () {
		dream11 = new HashMap<Integer, Integer>();
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
	}
	
	public Map<Integer, Integer> getDream11() {
		return dream11;
	}

	public void setDream11(Map<Integer, Integer> dream11) {
		this.dream11 = dream11;
	}

	public Integer getCaptain() {
		return captainId;
	}

	public void setCaptain(Integer captain) {
		this.captainId = captain;
	}

	public Integer getViceCaptain() {
		return viceCaptainId;
	}

	public void setViceCaptain(Integer viceCaptain) {
		this.viceCaptainId = viceCaptain;
	}
	
}
