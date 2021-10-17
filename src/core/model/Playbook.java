package core.model;

import core.model.polygon.Polygon;
import core.model.polygon.Rectangle;
import core.model.prism.Cube;
import core.model.prism.Prism;

public class Playbook {

	public static void main(String[] args) {
		Polygon p = new Rectangle(4,5);
		Prism pm = new Cube(5);
		
		Point t = p.getSommmet(0);
		t.setX(2);
		
		System.out.println(p.getSommmet(0).toString());

		System.out.println(p.area() + " " + p.perimeter());
		System.out.println(pm.areaBased() + " " + pm.volume());

	}

}
