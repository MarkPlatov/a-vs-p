package draw;

import draw.Drawer;

public class ConsoleDrawer<T> extends Drawer<T> {

	@Override
	public void draw(T obj) {
		System.out.print(obj);
	}
}
