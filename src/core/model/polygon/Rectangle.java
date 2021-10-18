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
	
	public Rectangle(Rectangle r){
		super(r);
		this.large = r.large;
		this.length = r.length;
	}

	
	/** 
	 * @return double
	 */
	public double getLarge() {
		return this.large;
	}

	
	/** 
	 * @return double
	 */
	public double getLength() {
		return this.length;
	}

	
	/** 
	 * @return String
	 */
	@Override
	public String toString() {
		return "Rectangle [l=" + large + ", L=" + length + ", toString()=" + super.toString() + "]";
	}
	
	
	/** 
	 * @return double
	 */
	public double area() {
		return this.large*this.length;
	}
	
	
	/** 
	 * @return double
	 */
	public double perimeter() {
		return (this.large+this.length)*2;
	}

}
