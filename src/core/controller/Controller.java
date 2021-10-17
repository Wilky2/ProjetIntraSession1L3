package core.controller;

import core.model.polygon.*;
import core.view.DisplayPolyg;
import core.view.Reader;

public class Controller {
  Reader reading = new Reader();
  Polygon polygon;
  Rectangle rec = new Rectangle(0, 0);
  Square square = new Square(0);

  public void run() {
    polygonSwitchCase();
  }


  public void polygonSwitchCase() {
    polygonMenu();

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
        polygonMenu();
        System.out.println("Choix inexistante !");
        break;
    }
  }

  public void polygonViewRectangle() {

    DisplayPolyg.showRectanglePart();
    System.out.println("Entrer Les Values ");

    System.out.println(".-Longueur");
    double val1 = reading.readingDouble();

    System.out.println(".-Largeur");
    double val2 = reading.readingDouble();

    rec.setLength(val1);
    rec.setLlarge(val2);

    DisplayPolyg.display("L'aire du rectangle = " + rec.area());
    DisplayPolyg.display("Perimetre de rectangle = " + rec.perimeter());
  }

  public void polygonViewCircle() {

    // DisplayPolyg.showRectanglePart();

    // System.out.println("Entrer Les Values ");
    // System.out.println(".  *Center");
    // System.out.println(".  *Rayon");

  }

  public void polygonViewSquare() {

    DisplayPolyg.showSquarePart();
    System.out.println("Entrer le cote ");

    System.out.println("-cote");
    double val1 = reading.readingDouble();

    square.setCote(val1);

    DisplayPolyg.display("L'aire du carre = " + square.area());
    DisplayPolyg.display("Perimetre de carre = " + square.perimeter());

  }

  public void polygonMenu() {
    DisplayPolyg.listViewPolygon();
  }
}
