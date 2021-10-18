package core.view;

import java.util.Scanner;

public class Reader {
	
	Scanner sc;
	
	public Reader() {
		sc = new Scanner(System.in);
	}
	
	/** 
	 * @return int
	 */
	public int readingInt() {
		return sc.nextInt();

	}

	
	/** 
	 * @return String
	 */
	public String readingString() {
		return sc.nextLine();

	}
	
	
	/** 
	 * @return double
	 */
	public double readingDouble() {
		return sc.nextDouble();
		
	}
	
}
