package draw;

import draw.Drawer;

public class ConsoleDrawer implements Drawer {
	@Override
	public void draw(Object obj) {
		System.out.println(obj.toString());
	}
}
