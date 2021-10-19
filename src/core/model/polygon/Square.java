package core.model.polygon;

import core.model.Point;

public class Square extends Rectangle {
	
	private double cote;
	
	public Square(double cote) {
		super(cote,cote);
		this.cote = cote;
	}
	
	public Square(final Square s) {
		super(s);
		this.cote = s.cote;
	}
	
	@Override
	public String toString() {
		return "Square [cote=" + cote + ", toString()=" + super.toString() + "]";
	}

	public double getCote() {
		return this.cote;
	}

	public void setCote(double cote) {
		super.setLarge(cote);
		super.setLength(cote);
		this.cote = cote;
	}
	
	public double area() {
		return this.cote*this.cote;
	}
	
	public double perimeter() {
		return this.cote*4;
	}
}
