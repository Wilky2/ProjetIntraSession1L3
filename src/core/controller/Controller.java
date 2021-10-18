package core.controller;

import java.util.InputMismatchException;

import core.model.polygon.Polygon;
import core.model.polygon.Rectangle;
import core.model.polygon.Square;
import core.model.prism.Cube;
import core.model.prism.Prism;
import core.view.Display;
import core.view.Reader;

public class Controller {
  Display a = new Display();
  Reader reading = new Reader();

  Polygon polygon;
  Prism prism;
  Rectangle rec = new Rectangle(0, 0);
  Square square = new Square(0);

  // ------------Running Programm---------------

  public void start() {
    switchCaseAllProgramm();
  }

  // -------------Switch Case All The Programm--------------

  public void switchCaseAllProgramm() {

    int choice;
    try {
      a.displayMenuSec();
      choice = reading.readingInt();

      switch (choice) {
        case 1:
          polygonSwitchCase();
          break;
        case 2:
          prismSwitchCase();
        break;
        default:
          // switchCaseAllProgramm();
          a.display("Choix inexistant, rentrer une choix valide");
          break;
      }
    } catch (InputMismatchException e) {
      a.display("Choix inexistant, rentrer une choix valide");
      reading.readingString();
    }

    try {
      a.display("Entrer 1 pour continer");

      choice = reading.readingInt();

      if (choice==1) {
        switchCaseAllProgramm();
      } else {
        a.display("Fin Programme");
      }
    } catch (InputMismatchException e) {
      a.display("Fin programme");
    }
  }

  // ===============Polygon Parts===============

  public void polygonSwitchCase() {
    a.getdPolygone().listViewPolygon();
    // DisplayPolygone.listViewPolygon();

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
        break;
    }
  }

  public void polygonViewRectangle() {
    a.getdPolygone().showRectanglePart();

    System.out.println("Valeur Longueur");
    double val1 = reading.readingDouble();

    System.out.println("Valeur Largeur");
    double val2 = reading.readingDouble();

    rec = new Rectangle(val1, val2);

    a.display("\nL'aire du rectangle = " + rec.area());
    a.display("Perimetre du rectangle = " + rec.perimeter());
  }

  public void polygonViewPolygon() {

  }

  public void polygonViewSquare() {
    a.getdPolygone().showSquarePart();
    System.out.println("Entrer le cote ");

    System.out.println("Valeur du cote");
    double val1 = reading.readingDouble();

    square = new Square(val1);

    a.display("\nL'aire du carre = " + square.area());
    a.display("Perimetre de carre = " + square.perimeter());

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
        prismViewCube();
        break;
      case 3:
        prismViewCube();
        break;

      default:
        a.getdPrism().listViewPrism();
        System.out.println("Choix inexistant !");
        break;
    }
  }

  public void prismViewCube() {

    a.getdCircle().showRectanglePart();
    System.out.println("\nEntrer la valeur ");

    double val1 = reading.readingDouble();
    prism = new Cube(val1);

    a.display("\nL'aire du prisme = " + prism.areaBased());
    a.display("La volume = " + prism.volume());

  }

  public void prismViewprism() {
    a.getdPrism().showPrismPart();
    System.out.println("\nEntrer Les Values ");

    System.out.println(" Entrer valeur Base");

    System.out.println(" Entrer valeur Hauteur");
    double val2 = reading.readingDouble();

    prism = new Prism(null, val2);

    a.display("L'aire du rectangle = " + prism.areaBased());
    a.display("Perimetre de rectangle = " + prism.volume());
  }

  public void prismViewRectangleParrallepiped() {
    a.getdPrism().showRectangleParrallepipedPart();

    System.out.println("\nEntrer Les Values ");

    System.out.println(" Entrer valeur Base");
    double val1 = reading.readingDouble();

    System.out.println(" Entrer valeur Hauteur");
    double val2 = reading.readingDouble();

    prism = new Prism(null, val2);
  }

  // ===============end Prisme================

  // ===============Circle Parts================

  

}
