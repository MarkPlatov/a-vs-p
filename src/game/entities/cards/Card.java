package game.entities.cards;

import game.entities.Entity;

public interface Card extends Entity {
	public void mix();
	public void take();
	public void use();
}
