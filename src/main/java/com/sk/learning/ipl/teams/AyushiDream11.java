package com.sk.learning.ipl.teams;

import java.util.HashMap;
import java.util.Map;

public class AyushiDream11 {
	
	private Map<Integer, Integer> dream11;
	private Integer captainId = 1;
	private Integer viceCaptainId = 164;
	
	public AyushiDream11 () {
		dream11 = new HashMap<Integer, Integer>();
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
