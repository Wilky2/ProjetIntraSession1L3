package core.model;

public class Polygon {
	
	int nbCote;
	Point[] listePoint;
	
	public Polygon(int nbCote) {
		this.listePoint = new Point[nbCote];
	}
	
	public Point getPoint(int i) {
		return listePoint[i];
	}
	
	public void setPoint(Point point,int i) {
		this.listePoint[i] = point;
	}
	
	public double surface() {
		
		double result1=0;
		double result2=0;
		
		for(int i = 0 ; i<listePoint.length-1;i++) {
			result1+=listePoint[i].getX() * listePoint[i+1].getY();
			result2+=listePoint[i].getY() * listePoint[i+1].getX();
		}
		
		result1+=listePoint[listePoint.length-1].getX() * listePoint[0].getY();
		result2+=listePoint[listePoint.length-1].getY() * listePoint[0].getX();
		
		
		return Math.abs((result1-result2)/2);
	}

}
