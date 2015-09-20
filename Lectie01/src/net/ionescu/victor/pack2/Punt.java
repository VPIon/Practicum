package net.ionescu.victor.pack2;

public class Punt {
	private double x;
	private double y;
	
	public Punt(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "<Punt(" + x + "," + y + ")>";
	}
	
	
	@Override
	public boolean equals(Object other) {
		if(other instanceof Punt) {
			Punt that = (Punt)other;
			return (this.x == that.x && this.y == that.y);
		}
		return false;
	}
	
	public void transleer(double dx, double dy) {
		x += dx;
		y += dy;
	}
	
	public double afstand(Punt other) {
		return (Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y ,2)));
	}
	
}
