package com.mark.avsp.game.entities.cards;

import com.mark.avsp.game.entities.Entity;

public interface CardsStack extends Entity {
	Card takeCard();
	
	void mix();
}
