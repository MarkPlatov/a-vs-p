package game.entities.units;

import game.entities.cards.armor.Armor;
import game.entities.cards.weapon.Weapon;
import game.entities.field.Cell;

public class UnitImpl implements Unit{
	@Override
	public void setDefault() {
	
	}
	
	@Override
	public String fullInfo() {
		return null;
	}
	
	@Override
	public String ammunitionInfo() {
		return null;
	}
	
	@Override
	public void spawn(Cell cell) {
	
	}
	
	@Override
	public void die() {
	
	}
	
	@Override
	public void newTurn() {
	
	}
	
	@Override
	public void setWeapon(Weapon weapon) {
	
	}
	
	@Override
	public void setArmor(Armor armor) {
	
	}
	
	@Override
	public Weapon dropWeapon() {
		return null;
	}
	
	@Override
	public Armor dropArmor() {
		return null;
	}
	
	@Override
	public boolean canAttack(Unit unit) {
		return false;
	}
	
	@Override
	public Attack attack() {
		return null;
	}
	
	@Override
	public Defend defend() {
		return null;
	}
	
	@Override
	public void move(Cell cell) {
	
	}
	
	@Override
	public boolean canMove(Cell cell) {
		return false;
	}
}
