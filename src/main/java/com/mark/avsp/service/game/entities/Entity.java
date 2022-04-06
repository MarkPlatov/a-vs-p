package com.mark.avsp.service.game.entities;

import com.mark.avsp.service.game.rules.info.Info;

public interface Entity {
	void setDefault();
	
	Info getInfo();
}
