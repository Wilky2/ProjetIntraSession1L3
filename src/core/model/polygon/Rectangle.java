package core.model.polygon;

import core.model.Point;

public class Rectangle extends Polygon {
	
	private double large,length;
	
	public Rectangle(double L,double l) {
		super(new Point[] {new Point(0,0),new Point(0,l),
				new Point(L,l),new Point(L,0)});
		this.large = l;
		this.length = L; 
	}

	public double getLarge() {
		return this.large;
	}

	public void setLlarge(double l) {
		this.large = l;
	}

	public double getLength() {
		return this.length;
	}

	public void setLength(double L) {
		this.length = L;
	}

	@Override
	public String toString() {
		return "Rectangle [l=" + large + ", L=" + length + ", toString()=" + super.toString() + "]";
	}
	
	public double area() {
		return this.large*this.length;
	}
	
	public double perimeter() {
		return (this.large+this.length)*2;
	}

}
