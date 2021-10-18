package core.model.polygon;

import java.util.Arrays;

import core.model.Point;

public class Polygon {
	
	private Point[] listeSommet;
	
	public Polygon(Point[] listeSommet) {
		this.listeSommet = Arrays.copyOf(listeSommet, listeSommet.length);
	}
	
	public Polygon(Polygon p) {
		this.listeSommet = Arrays.copyOf(p.listeSommet, p.listeSommet.length);
	}
	
	
	/** 
	 * @param i
	 * @return Point
	 */
	public Point getSommmet(int i) {
		return new Point(this.listeSommet[i]);
	}
	
	
	/** 
	 * @param i
	 * @return double
	 */
	public double getCote(int i) {
		if(i==this.listeSommet.length-1) {
				return Point.distance(this.listeSommet[0], this.listeSommet[this.listeSommet.length-1]);
		}
		return Point.distance(this.listeSommet[i], this.listeSommet[i+1]);
	}
	
	
	/** 
	 * @return int
	 */
	public int getNombreCote() {
		return this.listeSommet.length;
	}
	
	
	/** 
	 * @return String
	 */
	@Override
	public String toString() {
		return "Polygon [nombre Cote=" + getNombreCote() + ", listeSommet=" + Arrays.toString(this.listeSommet) + "]";
	}

	
	/** 
	 * @return double
	 */
	public double area(){
		
		double result1=0;
		double result2=0;
		
		for(int i = 0 ; i<this.listeSommet.length-1;i++) {
			result1+=this.listeSommet[i].getX() * this.listeSommet[i+1].getY();
			result2+=this.listeSommet[i].getY() * this.listeSommet[i+1].getX();
		}
		
		result1+=this.listeSommet[listeSommet.length-1].getX() * this.listeSommet[0].getY();
		result2+=this.listeSommet[this.listeSommet.length-1].getY() * this.listeSommet[0].getX();
		
		
		return Math.abs((result1-result2)/2);
	}
	
	
	/** 
	 * @return double
	 */
	public double perimeter() {
		
		double result = 0;
		
		for(int i =0; i<this.listeSommet.length;i++) {
			result+=getCote(i);
		}
		
		return result;
	}


}
