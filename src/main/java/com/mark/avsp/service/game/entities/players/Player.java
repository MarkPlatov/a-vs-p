package com.mark.avsp.service.game.entities.players;

import com.mark.avsp.service.game.entities.Entity;
import com.mark.avsp.service.game.entities.field.Cell;

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
