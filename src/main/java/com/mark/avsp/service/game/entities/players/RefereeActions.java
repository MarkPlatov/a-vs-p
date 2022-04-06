package com.mark.avsp.service.game.entities.players;

import com.mark.avsp.service.game.rules.info.PlayerInfo;

public interface RefereeActions {
	
	PlayerInfo getStat();
	
	void mute();
}
