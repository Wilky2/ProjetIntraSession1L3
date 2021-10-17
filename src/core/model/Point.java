package core.model;

public class Point {
	
	private double x;
	private double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
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
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public static double distance(Point p1,Point p2) {
		double d1,d2;
		d1 = p2.getX()-p1.getX();
		d2 = p2.getY()-p1.getY();
		return Math.sqrt((d1*d1) + (d2*d2));
	}

}