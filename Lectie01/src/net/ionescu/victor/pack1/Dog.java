package net.ionescu.victor.pack1;

public class Dog {
	
	String name;
	int age;
	
	Dog(String x, int y) {
		name = x;
		age = y;
	}
	
	public void bark() {
		System.out.println("Woef");
	}
	
	boolean sameName(Dog d) {
		return this.name.equals(d.name);
	}
	
	boolean sameAge(Dog e) {
		return this.age == e.age;
	}
}
