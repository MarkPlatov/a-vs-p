package com.mark.avsp.io.output.draw.consoleDrawer;

import com.mark.avsp.game.entities.Entity;
import com.mark.avsp.io.output.draw.Drawer;

public class ConsoleDrawer implements Drawer {
	
	@Override
	public void drawEntity(Entity entity) {
		System.out.println(entity.getInfo());
	}
}
