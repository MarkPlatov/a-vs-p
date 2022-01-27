package game.entities.players;

import game.entities.field.Cell;
import game.entities.units.Unit;

public interface ActiveActions {
	void moveUnits();
	
	void moveUnit(Unit unit, Cell destination);
	
	void startCombat();
	
	void attackUnit(Unit enemy);
	
	void takePlayerCard();
	
	void takeTerrainCard();
}
