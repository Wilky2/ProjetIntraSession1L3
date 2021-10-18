package core.model.prism;

import core.model.polygon.Polygon;

public class Prism {
	
	private Polygon based;
	
	private double height;

	public Prism(Polygon polygon, double height) {
		this.based = polygon;
		this.height = height;
	}
	
	public Prism(final Prism p) {
		this.based = p.based;
		this.height = p.height;
	}

	public Polygon getBased() {
		return based;
	}

	public void setBased(Polygon based) {
		this.based = based;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Prism [polygon=" + based + ", height=" + height + "]";
	}
	
	public double areaBased() {
		return this.based.area();
	}
	
	public double volume() {
		return areaBased() * this.height;
	}
	
}
