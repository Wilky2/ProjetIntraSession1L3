package core.view.occurence;

public class DisplayPolygone {

    public void listViewPolygon() {
        display("\n******Menu Polygone*******");
        display("1-  Rectangle");
        display("2-  Carre");
        display("3-  Polygone");
    }

    public void showRectanglePart() {
        display("\n********Main Rectangle********");
    }

    public void showSquarePart() {
        display("\n********Main Carre********");
    }

    public void showPolygonPart() {
        display("\n********Main Carre********");
    }

    
    /** 
     * @param str
     */
    public void display(Object str) {
        System.out.println(str);
    }

}
