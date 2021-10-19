package core.controller;

import java.util.InputMismatchException;

import core.model.Circle;
import core.model.Cylinder;
import core.model.Point;
import core.model.polygon.Polygon;
import core.model.polygon.Rectangle;
import core.model.polygon.Square;
import core.model.prism.Cube;
import core.model.prism.Prism;
import core.model.prism.RectangleParrallelepiped;
import core.view.Display;
import core.view.Reader;

public class Controller {

	private Display a;
	private Reader reading;

	private Polygon polygon;
	private Prism prism;
	private Cube cube;
	private RectangleParrallelepiped recP;
	private Circle circle;
	private Rectangle rec;
	private Square square;
	Cylinder cylinder;

	public Controller() {
		reading = new Reader();
		a = new Display();
		polygon = null;
		prism = null;
		cube = null;
		recP = null;
		circle = null;
		rec = null;
		square = null;
		cylinder = null;
	}

	// ------------Running Programm---------------

	public void start() {
		switchCaseAllProgramm();
	}

	// -------------Switch Case All The Programm--------------

	public void switchCaseAllProgramm() {
		int choice;

		try {
			a.displayMenuSec();
			Display.display("Choix...");
			choice = reading.readingInt();

			switch (choice) {
			case 1:
				polygonSwitchCase();
				break;

			case 2:
				prismSwitchCase();
				break;

			case 3:
				circleSwitchCase();
				break;

			case 4:
				cylenderSwitchcase();
				break;

			default:
				Display.display("Choix inexistant, rentrer un choix valide");
			}
		} catch (InputMismatchException e) {
			Display.display("Choix inexistant, rentrer une choix valide");
			reading.readingNextLine();
		}

		try {
			Display.display("\nEntrer 1 pour continuer");

			choice = reading.readingInt();

			if (choice == 1) {
				switchCaseAllProgramm();
			} else {
				Display.display("Fin Programme");
			}
		} catch (InputMismatchException e) {
			Display.display("Fin programme");
		}
	}

	// ===============Polygon Parts===============

	public void polygonSwitchCase() {
		a.getdPolygone().listViewPolygon();

		int choice = reading.readingInt();
		switch (choice) {
		case 1:
			polygonViewRectangle();
			break;
		case 2:
			polygonViewSquare();
			break;
		case 3:
			polygonViewPolygon();
			break;

		default:
			a.getdPolygone().listViewPolygon();
			System.out.println("Choix inexistant");
		}
	}

	public Rectangle valueRectangle() {
		double val1, val2;
		do {
			Display.display("Valeur Longueur");
			val1 = reading.readingDouble();

			Display.display("Valeur Largeur");
			val2 = reading.readingDouble();
		} while (val1 <= 0 || val2 <= 0);

		return new Rectangle(val1, val2);
	}

	public void polygonViewRectangle() {
		int choice;

		if (rec == null) {
			rec = valueRectangle();
		} else {
			Display.display("Presser 1 pour changer les valeurs entrer precedemment");
			String c = reading.readingString();
			if (c.equals("1")) {
				rec = valueRectangle();
			}
		}

		a.getdPolygone().showRectanglePart();
		choice = reading.readingInt();
		switch (choice) {
		case 1: {
			Display.display("Perimetre du rectangle = " + rec.perimeter());
		}
			break;

		case 2: {
			Display.display("\nL'aire du rectangle = " + rec.area());
		}
			break;

		case 3: {
			Display.display(rec.toString());
		}
			break;

		default: {
			Display.display("choix inexistant");
		}

		}
	}

	public Polygon valuePolygon() {
		int nbCote = 0;
		while (nbCote < 3) {
			Display.display("Entrer le nombre de cote du polygon");
			nbCote = reading.readingInt();
		}
		double x;
		double y;
		Point[] listeSommet = new Point[nbCote];
		for (int i = 0; i < listeSommet.length; i++) {

			Display.display("Entre l'abscisse (x) du sommet " + (i + 1));
			x = reading.readingDouble();
			Display.display("Entre l'ordonnee (y) du sommet " + (i + 1));
			y = reading.readingDouble();
			listeSommet[i] = new Point(x, y);

		}
		return new Polygon(listeSommet);
	}

	public void polygonViewPolygon() {
		int choice;

		if (polygon == null) {
			polygon = valuePolygon();
		} else {
			Display.display("Presser 1 pour changer les valeurs entrer precedemment");
			String c = reading.readingString();
			if (c.equals("1")) {
				polygon = valuePolygon();
			}
		}
		a.getdPolygone().showPolygonPart();

		choice = reading.readingInt();
		switch (choice) {
		case 1: {
			Display.display("Perimetre du polygone = " + polygon.perimeter());
		}
			break;

		case 2: {
			Display.display("\nL'aire du polygone = " + polygon.area());
		}
			break;

		case 3: {
			Display.display(polygon.toString());
		}
			break;

		default: {
			Display.display("choix inexistant");
		}

		}

	}

	public Square valueSquare() {
		double val1;
		do {
			Display.display("Valeur du cote");
			val1 = reading.readingDouble();
		} while (val1 <= 0);
		return new Square(val1);
	}

	public void polygonViewSquare() {
		int choice;
		if (square == null) {
			square = valueSquare();
		} else {
			Display.display("Presser 1 pour changer les valeurs entrer precedemment");
			String c = reading.readingString();
			if (c.equals("1")) {
				square = valueSquare();
			}
		}
		a.getdPolygone().showSquarePart();
		choice = reading.readingInt();
		switch (choice) {
		case 1: {
			Display.display("Perimetre de carre = " + square.perimeter());
		}
			break;

		case 2: {
			Display.display("L'aire du carre = " + square.area());
		}
			break;

		case 3: {
			Display.display(square.toString());
		}
			break;

		default: {
			Display.display("choix inexistant");
		}
		}
	}
	// ===============end Polygon=================

	// ===============Prisme Parts================

	public void prismSwitchCase() {
		a.getdPrism().listViewPrism();

		int choice = reading.readingInt();
		switch (choice) {
		case 1:
			prismViewCube();
			break;
		case 2:
			prismViewPrism();
			break;
		case 3:
			prismViewRectangleRectangleParrallelepiped();
			break;
		default:
			System.out.println("Choix inexistant !");
		}
	}

	public Cube valueCube() {
		double val1;
		do {
			Display.display("Valeur de l'arrete");
			val1 = reading.readingDouble();
		} while (val1 <= 0);
		return new Cube(val1);
	}

	public void prismViewCube() {
		int choice;
		if (cube == null) {
			cube = valueCube();
		} else {
			Display.display("Presser 1 pour changer les valeurs entrer precedemment");
			String c = reading.readingString();
			if (c.equals("1")) {
				cube = valueCube();
			}
		}

		a.getdPrism().showCubePart();
		choice = reading.readingInt();
		switch (choice) {
		case 1: {
			Display.display("\nSurface de la base du cube = " + cube.areaBased());
		}
			break;

		case 2: {
			Display.display("\nVolume du cube = " + cube.volume());
		}
			break;

		case 3: {
			Display.display(cube.toString());
		}
			break;

		default: {
			Display.display("choix inexistant");
		}
		}

	}

	public Prism valuePrism() {

		Polygon p = valuePolygon();

		double h;
		do {
			Display.display("Entrer la hauteur du prisme");
			h = reading.readingDouble();
		} while (h <= 0);

		return new Prism(p, h);

	}

	public void prismViewPrism() {
		int choice;
		if (prism == null) {
			prism = valuePrism();
		} else {
			Display.display("Presser 1 pour changer les valeurs entrer precedemment");
			String c = reading.readingString();
			if (c.equals("1")) {
				prism = valuePrism();
			}
		}
		a.getdPrism().showPrismPart();
		choice = reading.readingInt();
		switch (choice) {
		case 1: {
			Display.display("Surface de la base du prisme = " + prism.areaBased());
		}
			break;

		case 2: {
			Display.display("Volume du prisme = " + prism.volume());
		}
			break;

		case 3: {
			Display.display(prism.toString());
		}
			break;

		default: {
			Display.display("choix inexistant");
		}
		}
	}

	public RectangleParrallelepiped valueRectangleParrallelepiped() {
		double L, l, h;
		do {
			Display.display("entrer la longueur");
			L = reading.readingDouble();

			Display.display("entrer la largeur");
			l = reading.readingDouble();

			Display.display("entrer la hauteur");
			h = reading.readingDouble();
		} while (L <= 0 || l <= 0 || h <= 0);

		return new RectangleParrallelepiped(L, l, h);

	}

	public void prismViewRectangleRectangleParrallelepiped() {
		int choice;
		if (recP == null) {
			recP = valueRectangleParrallelepiped();
		} else {
			Display.display("Presser 1 pour changer les valeurs entrer precedemment");
			String c = reading.readingString();
			if (c.equals("1")) {
				recP = valueRectangleParrallelepiped();
			}
		}
		a.getdPrism().showRectangleParrallelepipedPart();
		choice = reading.readingInt();
		switch (choice) {
		case 1: {
			Display.display("\nSurface de la base du parrallelepipede rectangle = " + recP.areaBased());
		}
			break;

		case 2: {
			Display.display("\nVolume du du parrallelepipede rectangle = " + recP.volume());
		}
			break;

		case 3: {
			Display.display(recP.toString());
		}
			break;

		default: {
			Display.display("choix inexistant");
		}
		}
	}

	// ===============end Prisme================

	// ===============Circle Parts================
	// *******************************************

	public Circle valueCircle() {
		double val1, val2, val3;
		Display.display("Valeur Abscisse");
		val1 = reading.readingDouble();

		Display.display("Valeur Ordonne");
		val2 = reading.readingDouble();
		do {
			Display.display("Rayon");
			val3 = reading.readingDouble();
		} while (val3 <= 0);

		return new Circle(new Point(val1, val2), val3);
	}

	public void circleSwitchCase() {
		int choice;
		if (circle == null) {
			circle = valueCircle();
		} else {
			Display.display("Presser 1 pour changer les valeurs entrer precedemment");
			String c = reading.readingString();
			if (c.equals("1")) {
				circle = valueCircle();
				;
			}
		}
		a.getdCircle().listViewCircle();
		choice = reading.readingInt();
		switch (choice) {
		case 1: {
			Display.display("Perimetre du cercle = " + circle.perimeter());
		}
			break;

		case 2: {
			Display.display("\nL'aire du cercle = " + circle.area());
		}
			break;

		case 3: {
			Display.display(circle.toString());
		}
			break;

		default: {
			Display.display("choix inexistant");
		}
		}
	}

	// ===============end Circle================
	// ******************************************

	// ===============Cylender Parts================

	public Cylinder valueCylinder() {
		Circle c = valueCircle();
		double h;

		do {
			Display.display("Entrer la hauteur du cylindre");
			h = reading.readingDouble();
		} while (h <= 0);

		return new Cylinder(c, h);
	}

	public void cylenderSwitchcase() {
		int choice;
		if (cylinder == null) {
			cylinder = valueCylinder();
		} else {
			Display.display("Presser 1 pour changer les valeurs entrer precedemment");
			String c = reading.readingString();
			if (c.equals("1")) {
				cylinder = valueCylinder();
			}
		}
		a.getCylinder().listViewCylinder();
		choice = reading.readingInt();
		switch (choice) {
		case 1: {
			Display.display("surface de la base du cylindre = " + cylinder.areaBased());
		}
			break;

		case 2: {
			Display.display("volume du cylindre = " + cylinder.volume());
		}
			break;

		case 3: {
			Display.display(cylinder.toString());
		}
			break;

		default: {
			Display.display("choix inexistant");
		}
		}
	}

	// ===============end Cylender================
	// *******************************************

}
