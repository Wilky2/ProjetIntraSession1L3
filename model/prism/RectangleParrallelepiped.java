package core.model.prism;

import core.model.polygon.Rectangle;

public class RectangleParrallelepiped extends Prism {
	
	private double large,length;

	public RectangleParrallelepiped(double length,double large, double height) {
		super(new Rectangle(length,large), height);
		this.large = large;
		this.length = length;
	}

	public double getLarge() {
		return large;
	}

	public double getLength() {
		return length;
	}

	@Override
	public String toString() {
		return "RectangleParrallelepiped [large=" + large + ", length=" + length + ", toString()=" + super.toString()
				+ "]";
	}
}
