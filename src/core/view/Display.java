package core.view;

import core.view.occurence.DisplayCircle;
import core.view.occurence.DisplayPolygone;
import core.view.occurence.DisplayPrism;

public class Display {

    private DisplayCircle dCircle = new DisplayCircle();
    private DisplayPolygone dPolygone = new DisplayPolygone();
    private DisplayPrism dPrism = new DisplayPrism();

    public void displayMenuSec() {
        display("******Affichage Vue**********");
        display("1 Polygone");
        display("2 Prisme");
        display("3 Cercle");
        display("4 Cylindre");
    }

    public void display(Object str) {
        System.out.println(str);
    }

    public DisplayPolygone getdPolygone() {
        return dPolygone;
    }

    public DisplayCircle getdCircle() {
        return dCircle;
    }

    public DisplayPrism getdPrism() {
        return dPrism;
    }

}
