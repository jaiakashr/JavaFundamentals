package conditions;

import java.util.Scanner;

public class SwitchStatementExample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("admin - Gets Full Access");
		System.out.println("subadmin - Gets Access to create/delete courses");
		System.out.println("testprep - Gets Access to create/delete tests");
		System.out.println("user - Gets Access to consume content");
		System.out.println("Enter your Choice : ");
		String user = scan.nextLine();
		
		switch (user) {
		case "admin": 
			System.out.println("Gets Full Access");
			break;
			
		case "subadmin":
			System.out.println("Gets Access to create/delete courses");
			break;
			
		case "testprep":
			System.out.println("Gets Access to create/delete tests");
			break;
			
		case "user":
			System.out.println("Gets Access to consume content");
			break;
			
		default:
			System.out.println("You are trial user");
			break;
			
		}
	}
}
