package com.mark.avsp.game.entities.players;

import com.mark.avsp.game.entities.Entity;
import com.mark.avsp.game.entities.field.Cell;

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
