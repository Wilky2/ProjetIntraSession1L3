package core.model.prism;

import core.model.polygon.Polygon;

public class Prism {
	
	private Polygon based;
	
	private double height;

	public Prism(Polygon polygon, double height) {
		this.based = polygon;
		this.height = height;
	}
	
	public Prism(Prism p) {
		this.based = new Polygon(p.getPolygon());
		this.height = p.height;
	}

	public Prism(double d, double val2) {
	}

	
	/** 
	 * @return Polygon
	 */
	public Polygon getPolygon() {
		return new Polygon(based);
	}

	
	/** 
	 * @return double
	 */
	public double getHeight() {
		return height;
	}

	
	/** 
	 * @return String
	 */
	@Override
	public String toString() {
		return "Prism [polygon=" + based + ", height=" + height + "]";
	}
	
	
	/** 
	 * @return double
	 */
	public double areaBased() {
		return based.area();
	}
	
	
	/** 
	 * @return double
	 */
	public double volume() {
		return areaBased() * height;
	}
	
}
