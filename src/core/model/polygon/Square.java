package core.model.polygon;

public class Square extends Rectangle {
	
	private double cote;
	
	public Square(double cote) {
		super(cote,cote);
		this.cote = cote;
	}
	
	@Override
	public String toString() {
		return "Square [cote=" + cote + ", toString()=" + super.toString() + "]";
	}
	
	public double getCote() {
		return this.cote;
	}



	public void setCote(double cote) {
		this.cote = cote;
	}



	public double area() {
		return this.cote*this.cote;
	}
	
	public double perimeter() {
		return this.cote*4;
	}
}
