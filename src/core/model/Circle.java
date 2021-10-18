package core.model;

public class Circle {
	private Point center;
	private double ray;
	
	public Circle(Point center, double ray) {
		this.center = center;
		this.ray = ray;
	}

	
	/** 
	 * @return Point
	 */
	public Point getCenter() {
		return new Point(center);
	}

	
	/** 
	 * @return double
	 */
	public double getRay() {
		return ray;
	}

	
	/** 
	 * @return String
	 */
	@Override
	public String toString() {
		return "Circle [center=" + center + ", ray=" + ray + "]";
	}
	
	
	/** 
	 * @return double
	 */
	public double area() {
		
		return Math.PI * ray * ray;
	}
	
	
	/** 
	 * @return double
	 */
	public double perimeter() {
		return 2*Math.PI*ray;
	}
	
	
}