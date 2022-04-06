package com.mark.avsp.service.game.rules.raсes;

public interface Race{
//	String name = "Race name";
//	String winConditions = "Win conditions";
//	int steps = 0;
//	int power = 0;
	
	boolean isWin();
	
	boolean isLose();
	
	void addWinPoint();
	
	void addLosePoint();
}
