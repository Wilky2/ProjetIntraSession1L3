package core.model;

public class Circle {
	private Point center;
	private double ray;
	
	public Circle(Point center, double ray) {
		this.center = new Point(center);
		this.ray = ray;
	}
	
	public Circle(final Circle c) {
		this.center = new Point(c.center);
		this.ray = c.ray;
	}

	public Point getCenter() {
		return new Point(center);
	}

	public double getRay() {
		return ray;
	}

	@Override
	public String toString() {
		return "Circle [center=" + center + ", ray=" + ray + "]";
	}
	
	public double area() {
		
		return Math.PI * ray * ray;
	}
	
	public double perimeter() {
		return 2*Math.PI*ray;
	}
	
}