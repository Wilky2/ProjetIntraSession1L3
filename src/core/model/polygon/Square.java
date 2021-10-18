package core.model.polygon;

public class Square extends Rectangle {
	
	private double cote;
	
	public Square(double cote) {
		super(cote,cote);
		this.cote = cote;
	}
	
	public Square(Square s) {
		super(s);
		this.cote = s.cote;
	}
	
	
	/** 
	 * @return String
	 */
	@Override
	public String toString() {
		return "Square [cote=" + cote + ", toString()=" + super.toString() + "]";
	}
	
	
	/** 
	 * @return double
	 */
	public double getCote() {
		return this.cote;
	}

	
	/** 
	 * @return double
	 */
	public double area() {
		return this.cote*this.cote;
	}
	
	
	/** 
	 * @return double
	 */
	public double perimeter() {
		return this.cote*4;
	}
}
