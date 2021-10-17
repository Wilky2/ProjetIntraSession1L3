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

	public Polygon getPolygon() {
		return new Polygon(based);
	}

	public double getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "Prism [polygon=" + based + ", height=" + height + "]";
	}
	
	public double areaBased() {
		return based.area();
	}
	
	public double volume() {
		return areaBased() * height;
	}
	
}
