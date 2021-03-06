package com.mark.avsp.service.game.entities.units;

import com.mark.avsp.service.game.entities.Entity;
import com.mark.avsp.service.game.entities.cards.armor.Armor;
import com.mark.avsp.service.game.entities.cards.weapon.Weapon;
import com.mark.avsp.service.game.entities.field.Cell;


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
