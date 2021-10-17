package core.model;

public class Playbook {

	public static void main(String[] args) {
		Polygon p = new Polygon(4);
		
		p.setPoint(new Point((double) 0,(double) 0), 0);
		p.setPoint(new Point((double) 0,(double) 2), 1);
		p.setPoint(new Point((double) 4,(double) 2), 2);
		p.setPoint(new Point((double) 4,(double) 0), 3);
		
		System.out.println(p.surface());

	}

}
