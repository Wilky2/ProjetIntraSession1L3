package core.view;

public abstract class DisplayPolyg {

    public static void listViewPolygon() {
        display("\n******Menu Polygone*******");
        display("1-  Rectangle");
        display("2-  Carre");
        display("3-  Circle");
    }

    public static void showRectanglePart() {
        display("\n********Main Rectangle********");
        display("Entrer les deux cotes : ");
    }

    public static void showSquarePart() {
        display("\n********Main Carre********");
        display("cotes : ");
    }

    public static void display(Object str) {
        System.out.println(str);
    }

}
