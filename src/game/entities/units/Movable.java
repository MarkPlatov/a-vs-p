package game.entities.units;

import game.entities.field.Cell;

public interface Movable {
	void move(Cell cell);
	
	boolean canMove(Cell cell);
	
}
