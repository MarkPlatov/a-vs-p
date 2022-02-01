package io.output.draw.consoleDrawer;

import game.entities.Entity;
import io.output.draw.Drawer;

public class ConsoleDrawer implements Drawer {
	
	@Override
	public void drawEntity(Entity entity) {
		System.out.println(entity.getInfo());
	}
}
