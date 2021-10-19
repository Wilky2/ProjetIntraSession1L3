package core.view;

import java.util.Scanner;

public class Reader {
	
	Scanner sc;
	
	public Reader() {
		sc = new Scanner(System.in);
	}
	
	public int readingInt() {
		return sc.nextInt();

	}

	public String readingString() {
		return sc.next();

	}
	
	public void readingNextLine() {
		sc.nextLine();
	}
	
	public double readingDouble() {
		return sc.nextDouble();
		
	}
	
}
