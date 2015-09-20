package net.ionescu.victor.pack2;

public class Cirkel {
	private Punt middelPunt;
	private double straal;
	
	public Cirkel(Punt mp, double st) {
		this.middelPunt = mp;
		this.straal = st > 0 ? st : -1;
	}
	
	public Punt getMiddelpunt() {
		return middelPunt;
	}
	
	public double getStraal() {
		return straal;
	}

	@Override
	public String toString() {
		return "<Cirkel(" + 
				middelPunt + 
				"," + 
				straal + 
				")>";
	}
	
	public boolean equals(Object other) {
		if(other instanceof Cirkel) {
			Cirkel that = (Cirkel)other;
			
			return (this.middelPunt.equals(that.middelPunt) && this.straal == that.straal);
		}
		return false;
	}
	
	public double omtrek() {
		if(straal < 0) return 0;
		return Math.PI * straal * 2;
	}
	
	public double oppervlakte() {
		if(straal < 0) return 0;
		return Math.PI * straal * straal;
	}
	
	public void transleer(double dx, double dy) {
		middelPunt.transleer(dx, dy);
	}
	
	public boolean overlapt(Cirkel that) {
		return (this.middelPunt.afstand(that.middelPunt) <= this.straal + that.straal);
		
	}
}
