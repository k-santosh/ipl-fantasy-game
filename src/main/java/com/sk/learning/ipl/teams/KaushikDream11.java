package com.sk.learning.ipl.teams;

import java.util.HashMap;
import java.util.Map;

public class KaushikDream11 {
	
	private Map<Integer, Integer> dream11;
	private Integer captainId = 164;
	private Integer viceCaptainId = 123;
	
	public KaushikDream11 () {
		dream11 = new HashMap<Integer, Integer>();
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
