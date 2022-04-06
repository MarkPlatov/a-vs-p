package com.mark.avsp.game.entities.units;

import com.mark.avsp.game.entities.field.Cell;

public interface Movable {
	void move(Cell cell);
	
	boolean canMove(Cell cell);
	
}
