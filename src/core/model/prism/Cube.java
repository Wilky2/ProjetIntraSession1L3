package core.model.prism;

public class Cube extends RectangleParrallelepiped {
	
	private double arrete;
	
	public Cube(double arrete) {
		super(arrete,arrete,arrete);
		this.arrete = arrete;
	}

	
	/** 
	 * @return double
	 */
	public double getArrete() {
		return arrete;
	}

	
	/** 
	 * @return String
	 */
	@Override
	public String toString() {
		return "Cube [arrete=" + arrete + ", toString()=" + super.toString() + "]";
	}
}
