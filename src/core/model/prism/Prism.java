package core.model.prism;

import core.model.polygon.Polygon;

public class Prism {
	
	private Polygon based;
	
	private double height;

	public Prism(Polygon polygon, double height) {
		this.based = new Polygon(polygon);
		this.height = height;
	}

	public Polygon getPolygon() {
		return based;
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
