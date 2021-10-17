package core.view.occurence;

public class DisplayPrism {

    public void listViewPrism() {
        display("\n******Menu Prism*******");
        display("1-  Cube");
        display("2-  Prism");
        display("3-  Rectangle ");
    }

    public void showCubePart() {
        display("\n********Main Cube********");
        display("Entrer les deux cotes : ");
    }

    public void showPrismPart() {
        display("\n********Main Prism********");
        display("cotes : ");
    }

    public void showRectangleParrallepipedPart() {
        display("\n********Main Rectangle Parrallepiped********");
        display("cotes : ");
    }

    public void display(Object str) {
        System.out.println(str);
    }

}
