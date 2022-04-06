package com.mark.avsp.service.game.entities.field;

import com.mark.avsp.service.game.entities.Entity;
import com.mark.avsp.service.game.entities.units.Unit;
import com.mark.avsp.service.game.rules.raсes.Race;

public interface Cell extends Entity {
	void boom();
	
	int getDamageBonus(Race race);
	
	int getDamageBonus(Unit unit);
	
	int getDistanceBonus(Race race);
	
	int getDistanceBonus(Unit unit);
	
	boolean haveUnit(Race race);
	
	boolean haveAnyUnit();
	
	boolean isPossibleToSetUnit(Unit unit);
	
	boolean isPossibleToSetUnit(Race race);
	
	boolean moveUnitTo(Cell destinationCell);
}
