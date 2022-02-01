package game.entities.cards;

import game.entities.Entity;

public interface CardsStack extends Entity {
	Card takeCard();
	
	void mix();
}
