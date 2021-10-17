package core.controller;

import core.model.prism.Prism;
import core.view.Display;
import core.view.Reader;
// import core.view.occurence.DisplayPolygone;

public class ControllerPrism {
    Reader reading = new Reader();
    Display a = new Display();
    Prism prism;

    public void headerPrism() {
        prismSwitchCase();
    }

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
                System.out.println("Choix inexistante !");
                break;
        }
    }

    public void prismViewCube() {

        a.getdCircle().showRectanglePart();
        System.out.println("Entrer Les Values ");

        System.out.println(".-Longueur");
        double val1 = reading.readingDouble();

        System.out.println(".-Largeur");
        double val2 = reading.readingDouble();


    }

    public void prismViewprism() {
        a.getdPrism().showPrismPart();
        // DisplayPrism.showPrismPart();
        System.out.println("Entrer Les Values ");

        System.out.println(".-Base");
        // double val1 = reading.readingDouble();

        System.out.println(".-Hauteru");
        double val2 = reading.readingDouble();

        prism = new Prism(null, val2);
        // rec.setLength(val1);
        // rec.setLlarge(val2);

        a.display("L'aire du rectangle = " + prism.areaBased());
        a.display("Perimetre de rectangle = " + prism.volume());
    }

    public void prismViewRectangleParrallepiped() {

        a.getdPrism().showRectangleParrallepipedPart();
        // DisplayPolygone.showSquarePart();
        System.out.println("Entrer le cote ");

        System.out.println("-cote");
        // double val1 = reading.readingDouble();

        // square = new Square(val1);
        // // square.setCote(val1);

        // DisplayPolygone.display("L'aire du carre = " + square.area());
        // DisplayPolygone.display("Perimetre de carre = " + square.perimeter());

    }

}
