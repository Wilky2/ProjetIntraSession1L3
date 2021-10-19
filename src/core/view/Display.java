package core.view;

import core.view.occurence.DisplayCircle;
import core.view.occurence.DisplayCylinder;
import core.view.occurence.DisplayPolygone;
import core.view.occurence.DisplayPrism;

public class Display {

    private DisplayCircle dCircle; 
    private DisplayPolygone dPolygone; 
    private DisplayPrism dPrism; 
    private DisplayCylinder cylinder;
    
    public Display() {
    	dCircle = new DisplayCircle();
    	dPolygone = new DisplayPolygone();
    	dPrism = new DisplayPrism();
    	cylinder = new DisplayCylinder();
    }

    public void displayMenuSec() {
        display("\n***************Running Head Programm***************");
        display("1 -Polygone");
        display("2 -Prisme");
        display("3 -Cercle");
        display("4 -Cylindre");
        display("");
        display("choix compris entre 1-4");
    }

    
    
    
    public DisplayCylinder getCylinder() {
		return cylinder;
	}




	public void setCylinder(DisplayCylinder cylinder) {
		this.cylinder = cylinder;
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

   
    public static void display(Object str) {
        System.out.println(str);
    }
}
