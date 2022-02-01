package game.entities.field;

import game.entities.Entity;

public interface Field extends Entity {
	int distance(Cell cell1, Cell cell2);
	
	void orbitalShotLeftTop(Cell leftTopCellOfBoom);
	
	void orbitalShotRightBottom(Cell rightBottomCellOfBoom);
	
	void selfLiquidation(Cell CentralCellOfBom);
	
	CellInfo getCellInfo(Cell cell);
	
	boolean setTerrainCard(Cell cell);
	
	void updateInnerState();
}
