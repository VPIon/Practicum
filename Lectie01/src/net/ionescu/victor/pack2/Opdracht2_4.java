package net.ionescu.victor.pack2;

public class Opdracht2_4 {

	public static void main(String[] args) {
		Punt p1 = new Punt(1, 1);
		Cirkel c1 = new Cirkel(p1, 2);
		Cirkel c2 = new Cirkel(p1, -3);
		
		System.out.println(c1.getMiddelpunt());
		System.out.println(c1.getStraal());
		
		System.out.println();
		
		System.out.println(c2.getMiddelpunt());
		System.out.println(c2.getStraal());
		
		System.out.println("String representatie van c1: " + c1);
		System.out.println("String representatie van c2: " + c2);
		
	}

}
