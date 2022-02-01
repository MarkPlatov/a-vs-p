package game.entities.players;

import game.entities.cards.CardPlayerSquad;
import game.entities.units.Defend;
import game.entities.units.Unit;

public interface DefendActions {
	Defend defendUnit(Unit unit);
	
	Defend defendUnitBySquad(Unit unit, CardPlayerSquad squad);
}
