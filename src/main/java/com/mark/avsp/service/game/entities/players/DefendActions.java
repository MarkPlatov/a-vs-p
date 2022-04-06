package com.mark.avsp.service.game.entities.players;

import com.mark.avsp.service.game.entities.cards.CardPlayerSquad;
import com.mark.avsp.service.game.entities.units.Defend;
import com.mark.avsp.service.game.entities.units.Unit;

public interface DefendActions {
	Defend defendUnit(Unit unit);
	
	Defend defendUnitBySquad(Unit unit, CardPlayerSquad squad);
}
