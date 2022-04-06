package com.mark.avsp.persistence.factoryes;

import com.mark.avsp.persistence.models.Unit;

public class UnitFactory {
    private String race; // todo: String -> enum
    private Integer baseSpeed; // todo: String -> enum Speed
    private Integer basePower; // todo: String -> enum Power
    private String weapon; // todo: String -> Weapon
    private String armor; // todo: String -> Armor

    public UnitFactory race(String race){
        this.race = race;
        return this;
    }
    public UnitFactory baseSpeed(Integer baseSpeed){
        this.baseSpeed = baseSpeed;
        return this;
    }
    public UnitFactory basePower(Integer basePower){
        this.basePower = basePower;
        return this;
    }
    public UnitFactory weapon(String weapon){
        this.weapon = weapon;
        return this;
    }
    public UnitFactory armor(String armor){
        this.armor = armor;
        return this;
    }
    public Unit build(){
        return new Unit(race, baseSpeed, basePower, weapon, armor);
    }


}
