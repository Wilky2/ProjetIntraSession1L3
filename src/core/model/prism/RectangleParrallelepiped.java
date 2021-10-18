package core.model.prism;

import core.model.polygon.Rectangle;

public class RectangleParrallelepiped extends Prism {
	
	private double large,length;

	public RectangleParrallelepiped(double length,double large, double height) {
		super(new Rectangle(length,large), height);
		this.large = large;
		this.length = length;
	}
	
	public RectangleParrallelepiped(final RectangleParrallelepiped r) {
		super(r);
		this.large = r.large;
		this.length = r.length;
	}

	public double getLarge() {
		return large;
	}
	
	public void setLarge(double large) {
		
		super.setBased(new Rectangle(this.length,large));
		this.large = large;
		
	}

	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		super.setBased(new Rectangle(length,large));
		this.length = length;
	}

	@Override
	public String toString() {
		return "RectangleParrallelepiped [large=" + large + ", length=" + length + ", toString()=" + super.toString()
				+ "]";
	}
}
