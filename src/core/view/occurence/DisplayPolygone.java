package core.view.occurence;

import core.view.Display;

public class DisplayPolygone {

    public void listViewPolygon() {
        Display.display("\n******Menu Polygone*******");
        Display.display("1-  Rectangle");
        Display.display("2-  Carre");
        Display.display("3-  Polygone");
    }

    public void showRectanglePart() {
    	Display.display("\n********Main Rectangle********");
    	Display.display("1-  Perimetre d'un rectangle");
    	Display.display("2-  Surface d'un rectangle");
    	Display.display("3-  Afficher les caracteristiques du rectangle");
    }

    public void showSquarePart() {
    	Display.display("\n********Main Carre********");
    	Display.display("1-  Perimetre d'un carre");
    	Display.display("2-  Surface d'un carre");
    	Display.display("3-  Afficher les caracteristiques du carre");
    }

    public void showPolygonPart() {
    	Display.display("\n***************Main Carre***************");
    	Display.display("1-  Perimetre du polygone");
    	Display.display("2-  Surface du polygone");
    	Display.display("3-  Afficher les caracteristiques du polygone");
    }
}
