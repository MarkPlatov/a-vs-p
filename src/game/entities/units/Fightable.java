package game.entities.units;

public interface Fightable {
	
	boolean canAttack(Unit unit);
	
	Attack attack();
	
	Defend defend();
}
