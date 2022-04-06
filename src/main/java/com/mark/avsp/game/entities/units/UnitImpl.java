package com.mark.avsp.game.entities.units;

import com.mark.avsp.game.entities.cards.armor.Armor;
import com.mark.avsp.game.entities.cards.weapon.Weapon;
import com.mark.avsp.game.entities.field.Cell;
import com.mark.avsp.game.rules.info.Info;

public class UnitImpl implements Unit{
	@Override
	public void setDefault() {
	
	}
	
	@Override
	public Info getInfo() {
		return null;
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
	public Shot attack() {
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
