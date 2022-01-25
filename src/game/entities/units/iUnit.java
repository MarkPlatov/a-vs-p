package game.entities.units;

import game.entities.Entity;


public interface iUnit extends Entity {
	
	public void move();
	
	public void spawn();
	
	public int attack();
	
	public int defend();
	
	public void die();
	
	public String info();
}
