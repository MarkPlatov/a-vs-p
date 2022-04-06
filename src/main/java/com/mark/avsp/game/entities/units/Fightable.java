package com.mark.avsp.game.entities.units;

public interface Fightable {
	
	boolean canAttack(Unit unit);
	
	Shot attack();
	
	Defend defend();
}
