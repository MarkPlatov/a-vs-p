package com.mark.avsp.service.game.entities.cards;

import com.mark.avsp.service.game.entities.Entity;

public interface CardsStack extends Entity {
	Card takeCard();
	
	void mix();
}
