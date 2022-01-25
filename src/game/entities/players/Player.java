package game.entities.players;

import game.entities.units.iUnit;

public interface Player {
	iUnit[] units = new iUnit[0];
	
	
	public void startTurn();
	public void finishTurn();
	public void moveUnits();
	public void takePlayerCard();
	public void takeTerrainCard();
	
}
