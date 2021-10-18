package core.model;

import core.model.polygon.Polygon;
import core.model.polygon.Rectangle;
import core.model.polygon.Square;
import core.model.prism.Cube;
import core.model.prism.Prism;
import core.model.prism.RectangleParrallelepiped;

public class Playbook {

	public static void main(String[] args) {
		Polygon p = new Square(4);
		Prism pm = new RectangleParrallelepiped(5,4,5);
		
		p.setSommet(new Point(4,5),0);
		
		 ((RectangleParrallelepiped) pm).setLength(6);
		
		Point t = p.getSommet(0);
		t.setX(2);
		
		System.out.println(p.getSommet(0).toString());
		System.out.println(p.getSommet(1).toString());
		System.out.println(p.getSommet(2).toString());
		System.out.println(p.getSommet(3).toString());
		
		System.out.println(p.getCote(0));
		System.out.println(p.getCote(1));
		System.out.println(p.getCote(2));
		System.out.println(p.getCote(3));

		System.out.println(p.area() + " " + p.perimeter());
		System.out.println(pm.areaBased() + " " + pm.volume());

	}

}
