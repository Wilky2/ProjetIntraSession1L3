package core.controller;

import core.model.polygon.Polygon;
import core.model.polygon.Rectangle;
import core.model.polygon.Square;
import core.view.Display;
import core.view.Reader;

public class Controller {
  Display a = new Display();
  Reader reading = new Reader();
  
  Polygon polygon;
  Rectangle rec = new Rectangle(0, 0);
  Square square = new Square(0);

  public void headerPolygon() {
    polygonSwitchCase();
  }

  public void polygonSwitchCase() {
    a.getdPolygone().showPolygonPart();
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
        polygonViewRectangle();
        break;

      default:
        a.getdPolygone().listViewPolygon();
        // DisplayPolygone.listViewPolygon();
        System.out.println("Choix inexistante !");
        break;
    }
  }

  public void polygonViewRectangle() {
    a.getdPolygone().showRectanglePart();
    // DisplayPolygone.showRectanglePart();
    System.out.println("Entrer Les Values ");

    System.out.println(".-Longueur");
    double val1 = reading.readingDouble();

    System.out.println(".-Largeur");
    double val2 = reading.readingDouble();

    rec = new Rectangle(val1, val2);
    // rec.setLength(val1);
    // rec.setLlarge(val2);

    a.display("L'aire du rectangle = " + rec.area());
    a.display("Perimetre de rectangle = " + rec.perimeter());
  }

  public void polygonViewPolygon() {
      
  }

  public void polygonViewSquare() {
    a.getdPolygone().showSquarePart();
    // a.showSquarePart();
    System.out.println("Entrer le cote ");

    System.out.println("-cote");
    double val1 = reading.readingDouble();

    square = new Square(val1);
    // square.setCote(val1);

    a.display("L'aire du carre = " + square.area());
    a.display("Perimetre de carre = " + square.perimeter());

  }

}
