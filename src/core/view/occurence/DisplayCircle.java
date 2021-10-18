package core.view.occurence;

public class DisplayCircle {


    public void listViewCircle() {
        display("\n******Menu Circle*******");
        display("1-  Rectangle");
        display("2-  Carre");
        display("3-  Polygone");
    }

    public void showRectanglePart() {
        display("\n********Main Rectangle********");
        display("Entrer les deux cotes : ");
    }

    public void showSquarePart() {
        display("\n********Main Carre********");
        display("cotes : ");
    }

    public void showPolygonPart() {
        display("\n********Main Carre********");
        display("cotes : ");
    }

    
    /** 
     * @param str
     */
    public void display(Object str) {
        System.out.println(str);
    }

}
