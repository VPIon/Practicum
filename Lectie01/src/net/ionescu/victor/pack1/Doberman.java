package net.ionescu.victor.pack1;

public class Doberman extends Dog {
	
	Doberman(String x, int y) {
		super(x,y);
	}
	public void kill() {
		System.out.println("I kill you");
	}
	
	public void bark() {
		super.bark();
		System.out.println("WOEF!");
	}
}
