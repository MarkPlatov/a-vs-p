package game.entities.players;

import game.entities.Entity;
import game.entities.field.Cell;
import game.entities.units.Unit;
import game.rules.info.PlayerInfo;

public interface Player extends Entity, ActiveActions, DefendActions {
//	Unit[] units = new Unit[0];
	
	void startTurn();
	
	void finishTurn();
	
	void usePlayerCard();
	
	void useTerrainCard(Cell cell);
	
	void showCards();
	
	void showEnemiesStats();
	
	void showArmy();
	
}
