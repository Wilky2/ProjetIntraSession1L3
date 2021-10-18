package core.view.occurence;

public class DisplayPrism {

    public void listViewPrism() {
        display("\n******Menu Prism*******");
        display("1-  Cube");
        display("2-  Prism");
        display("3-  Rectangle");
    }

    public void showCubePart() {
        display("\n********Main Cube********");
    }

    public void showPrismPart() {
        display("\n********Main Prism********");
    }

    public void showRectangleParrallepipedPart() {
        display("\n********Main Rectangle Parrallepipede********");
    }

    
    /** 
     * @param str
     */
    public void display(Object str) {
        System.out.println(str);
    }

}
