package net.ionescu.victor.pack1;

public class Main {

	public static void warnanddamage(Dog dog) {
		dog.bark();
		if(dog instanceof Doberman) {
			((Doberman)dog).kill();
		}
		if(dog instanceof Shitzu) {
			((Shitzu)dog).scratch();
		}
	}
	
	public static void main(String[] args) {
		
		
		Dog ben = new Dog("Benjamin", 3);
//		ben.bark();
		
		Dog boris = new Doberman("Borissimo", 2);
//		boris.bark();
//		((Doberman)boris).kill();
		
		Dog rakker = new Shitzu("Kanazawa", 1);
//		((Shitzu)rakker).scratch();
		
		warnanddamage(boris);
		
		Dog newDog;
		newDog = boris;
		newDog.bark();
		
		if(rakker.sameName(ben)) {
			System.out.println("Same name");
		}
		
		if(ben.sameAge(rakker)) {
			System.out.println("Same age");
		}
	}

}
