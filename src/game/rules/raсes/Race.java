package game.rules.raсes;

public interface Race{
	String name = "Race name";
	String winConditions = "Win conditions";
	int steps = 0;
	int power = 0;
	
	public boolean isWin();
	public boolean isLose();
}
