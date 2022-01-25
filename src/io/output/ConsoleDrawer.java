package io.output;

public class ConsoleDrawer<T> implements Drawer<T> {

	@Override
	public void draw(T obj) {
		System.out.print(obj);
	}
}
