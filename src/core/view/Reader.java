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
	 * @return double
	 */
	public double readingDouble() {
		return sc.nextDouble();
		
	}
	
}
