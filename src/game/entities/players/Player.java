package game.entities.players;

import game.entities.units.Unit;

public interface Player {
	Unit[] units = new Unit[0];
	
	
	public void startTurn();
	public void finishTurn();
	public void moveUnits();
	public void takePlayerCard();
	public void takeTerrainCard();
	
}
