package loops;

import java.util.Scanner;

public class DoWhileLoopExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input;
		do {
			System.out.println("Enter Message: ");
		    input = scan.nextLine().toLowerCase();
			System.out.println(input);
		} while(!input.equals("quit"));
			
	}
}
