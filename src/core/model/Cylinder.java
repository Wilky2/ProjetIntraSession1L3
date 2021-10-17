package core.model;

public class Cylinder {
	private double height;
	private Circle based;
	
	public Cylinder(double height, Circle based) {
		this.height = height;
		this.based = based;
	}
	
	public Cylinder(final Cylinder c) {
		this.based = c.based;
		this.height = c.height;
	}

	public double getHeight() {
		return height;
	}

	public Circle getBased() {
		return new Circle(based);
	}

	@Override
	public String toString() {
		return "Cylinder [height=" + height + ", based=" + based + "]";
	}
	
	public double areaBased() {
		return this.based.area();
	}
	
	public double volume() {
		return areaBased() * this.height;
	}
}
