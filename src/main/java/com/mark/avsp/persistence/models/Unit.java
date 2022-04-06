package com.mark.avsp.persistence.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String race; // todo: String -> enum
    private Integer baseSpeed; // todo: String -> enum Speed
    private Integer basePower; // todo: String -> enum Power
    private String weapon; // todo: String -> Weapon
    private String armor; // todo: String -> Armor
    private boolean isAlive;

    public Unit() {
    }

    public Unit(String race, Integer baseSpeed, Integer basePower, String weapon, String armor) {
        this.race = race;
        this.baseSpeed = baseSpeed;
        this.basePower = basePower;
        this.weapon = weapon;
        this.armor = armor;
        isAlive = true;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Integer getBaseSpeed() {
        return baseSpeed;
    }

    public void setBaseSpeed(Integer baseSpeed) {
        this.baseSpeed = baseSpeed;
    }

    public Integer getBasePower() {
        return basePower;
    }

    public void setBasePower(Integer basePower) {
        this.basePower = basePower;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
