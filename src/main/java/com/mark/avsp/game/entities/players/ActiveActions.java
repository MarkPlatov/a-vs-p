package com.mark.avsp.game.entities.players;

import com.mark.avsp.game.entities.field.Cell;
import com.mark.avsp.game.entities.units.Unit;

public interface ActiveActions {
	void moveUnits();
	
	void moveUnit(Unit unit, Cell destination);
	
	void startCombat();
	
	void attackUnit(Unit enemy);
	
	void takePlayerCard();
	
	void takeTerrainCard();
}
