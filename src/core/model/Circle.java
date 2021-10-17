package core.model;

public class Circle {
	private Point center;
	private double ray;
	
	public Circle(Point center, double ray) {
		this.center = center;
		this.ray = ray;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public double getRay() {
		return ray;
	}

	public void setRay(double ray) {
		this.ray = ray;
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