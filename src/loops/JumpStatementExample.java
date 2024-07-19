package loops;

import java.util.Scanner;

public class JumpStatementExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input="";
		
		while(!input.equals("quit")) {
			System.out.println("Enter a Message : ");
			input = scan.nextLine().toLowerCase();
			
			if(input.equals("quit"))
				break;
			if(input.equals("pass"))
				continue;
			
			System.out.println("Message is : " + input);
		}
	}
}
