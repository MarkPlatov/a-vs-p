package game.rules.raсes;

public interface Race{
	String name = "Race name";
	String winConditions = "Win conditions";
	
	public boolean isWin();
	public boolean isLose();
}
