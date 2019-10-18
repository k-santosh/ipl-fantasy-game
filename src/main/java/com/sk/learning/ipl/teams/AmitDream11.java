package com.sk.learning.ipl.teams;

import java.util.HashMap;
import java.util.Map;

public class AmitDream11{
	
	private Map<Integer, Integer> dream11;
	private Integer captainId = 164;
	private Integer viceCaptainId = 1154;
	
	public AmitDream11 () {
		dream11 = new HashMap<Integer, Integer>();
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
