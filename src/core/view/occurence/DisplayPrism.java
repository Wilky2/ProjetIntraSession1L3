package core.view.occurence;

import core.view.Display;

public class DisplayPrism {

    public void listViewPrism() {
    	Display.display("\n***************Menu Prism***************");
        Display.display("1-  Cube");
        Display.display("2-  Prisme");
        Display.display("3-  parrallelepipede rectangle");
    }

    public void showCubePart() {
    	Display.display("\n************Main Cube************");
    	Display.display("1-   surface de la base");
    	Display.display("2-   volume du cube");
    	Display.display("3-   afficher les caracteristiques du cube");
    }

    public void showPrismPart() {
    	Display.display("\n************Main Prisme************");
    	Display.display("1-   surface de la base");
    	Display.display("2-   volume du prisme");
    	Display.display("3-   afficher les caracteristiques du prisme");
    }

    public void showRectangleParrallelepipedPart() {
    	Display.display("\n************Main Rectangle Parrallelepiped************");
    	Display.display("1-   surface de la base");
    	Display.display("2-   volume du parrallelepipede rectangle");
    	Display.display("3-   afficher les caracteristiques du parrallelepipede rectangle");
    }

}
