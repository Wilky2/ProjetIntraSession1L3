package core.model.prism;

public class Cube extends RectangleParrallelepiped {
	
	private double arrete;
	
	public Cube(double arrete) {
		super(arrete,arrete,arrete);
		this.arrete = arrete;
	}
	
	public Cube(final Cube c) {
		super(c);
		this.arrete = c.arrete;
	}

	public double getArrete() {
		return arrete;
	}

	@Override
	public String toString() {
		return "Cube [arrete=" + arrete + ", toString()=" + super.toString() + "]";
	}
}
