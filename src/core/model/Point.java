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
	
	
	/** 
	 * @return double
	 */
	public double getX() {
		return x;
	}
	
	/** 
	 * @param x
	 */
	public void setX(double x) {
		this.x = x;
	}
	
	/** 
	 * @return double
	 */
	public double getY() {
		return y;
	}
	
	/** 
	 * @param y
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	/** 
	 * @return String
	 */
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	/** 
	 * @param p1
	 * @param p2
	 * @return double
	 */
	public static double distance(Point p1,Point p2) {
		double d1,d2;
		d1 = p2.getX()-p1.getX();
		d2 = p2.getY()-p1.getY();
		return Math.sqrt((d1*d1) + (d2*d2));
	}

}