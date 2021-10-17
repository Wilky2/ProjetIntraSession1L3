package core.model;

import core.model.polygon.Polygon;

public class Playbook {

	public static void main(String[] args) {
		Polygon p = new Polygon(new Point[] {new Point((double) 0,(double) 0),new Point((double) 0,(double) 4),
				new Point((double) 4,(double) 4),new Point((double) 4,(double) 0)});
		
		System.out.println(p.area() + " " + p.perimeter());

		
	}

}
