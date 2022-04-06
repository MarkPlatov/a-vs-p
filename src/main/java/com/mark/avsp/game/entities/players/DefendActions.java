package com.mark.avsp.game.entities.players;

import com.mark.avsp.game.entities.cards.CardPlayerSquad;
import com.mark.avsp.game.entities.units.Defend;
import com.mark.avsp.game.entities.units.Unit;

public interface DefendActions {
	Defend defendUnit(Unit unit);
	
	Defend defendUnitBySquad(Unit unit, CardPlayerSquad squad);
}
