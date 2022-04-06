package com.mark.avsp.service.game.entities.units;

import com.mark.avsp.service.game.entities.field.Cell;

public interface Movable {
	void move(Cell cell);
	
	boolean canMove(Cell cell);
	
}
