package game.entities.units;

import game.entities.Entity;
import game.entities.cards.armor.Armor;
import game.entities.cards.weapon.Weapon;
import game.entities.field.Cell;


public interface Unit extends Entity, Movable, Fightable {
	
	String fullInfo();
	
	String ammunitionInfo();
	
	void spawn(Cell cell);
	
	void die();
	
	void newTurn();
	
	void setWeapon(Weapon weapon);
	
	void setArmor(Armor armor);
	
	Weapon dropWeapon();
	
	Armor dropArmor();
}
