package core.model.polygon;

import core.model.Point;

public class Rectangle extends Polygon {
	
	private double large,length;
	
	public Rectangle(double L,double l) {
		super(new Point[] {new Point(0,0),new Point(0,l),
				new Point(L,l),new Point(L,0)});
		this.large = l;
		this.length = L; 
	}
	
	public Rectangle(final Rectangle r){
		super(r);
		this.large = r.large;
		this.length = r.length;
	}

	public void setSommet(Point p,int i) {
		double d1 = p.getX() - super.getSommet(i).getX();
		double d2 = p.getY() - super.getSommet(i).getY();
		for(int j = 0 ; j< getNombreCote() ; j++) {
			super.setSommet(new Point(super.getSommet(j).getX()+d1,super.getSommet(j).getY()+d2),j);
		}
	}

	public double getLarge() {
		return large;
	}

	public void setLarge(double large) {
		double d = large - this.large;
		Point p1 = new Point(super.getSommet(1).getX(),super.getSommet(1).getY()+d);
		Point p2 = new Point(super.getSommet(2).getX(),super.getSommet(2).getY()+d);
		super.setSommet(p1, 1);
		super.setSommet(p2, 2);
		this.large = large;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		double d = length - this.length;
		Point p2 = new Point(super.getSommet(2).getX()+d,super.getSommet(2).getY());
		Point p3 = new Point(super.getSommet(3).getX()+d,super.getSommet(3).getY());
		super.setSommet(p2, 2);
		super.setSommet(p3, 3);
		this.length = length;
	}

	
	
	@Override
	public String toString() {
		return "Rectangle [large=" + large + ", length=" + length + ", toString()=" + super.toString() + "]";
	}

	public double area() {
		return this.large*this.length;
	}
	
	public double perimeter() {
		return (this.large+this.length)*2;
	}

}
