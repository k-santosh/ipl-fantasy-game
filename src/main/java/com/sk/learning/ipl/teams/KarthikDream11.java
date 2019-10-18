package com.sk.learning.ipl.teams;

import java.util.HashMap;
import java.util.Map;

public class KarthikDream11 {
	
	private Map<Integer, Integer> dream11;
	private Integer captainId = 233;
	private Integer viceCaptainId = 107;
	
	public KarthikDream11 () {
		dream11 = new HashMap<Integer, Integer>();
		dream11.put(233, 0);
		dream11.put(107, 0);
		dream11.put(127, 0);
		dream11.put(1124, 0);
		dream11.put(86, 0);
		dream11.put(0, 0);
		dream11.put(30, 0);
		dream11.put(100, 0);
		dream11.put(202, 0);
		dream11.put(123, 0);
		dream11.put(236, 0);
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
