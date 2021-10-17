package core.model;

import core.model.polygon.Polygon;
import core.model.polygon.Rectangle;
import core.model.polygon.Square;
import core.model.prism.Prism;

public class Playbook {

	public static void main(String[] args) {
		Polygon p = new Rectangle(4,5);
		Prism pm = new Prism(p,5);

		System.out.println(p.area() + " " + p.perimeter());
		System.out.println(pm.areaBased() + " " + pm.volume());

	}

}
