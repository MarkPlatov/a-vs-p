package game.raсes;

import game.Drawable;

public interface Race extends Drawable {
	String name = "Race name";
	String winConditions = "Win conditions";
	
	public boolean isWin();
	public boolean isLose();
}
