package basics;

import java.util.Scanner;

public class ReadInputFromUserExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scan.nextLine();
		System.out.println("Enter your age: ");
		int age = scan.nextInt();
		System.out.println("Enter your Gender(M/F): ");
		char gender = scan.next().charAt(0);
		System.out.println("Enter your Contact Number: ");
		double contact = scan.nextDouble();
		System.out.println("");
		
		System.out.println("STUDENT DETAILS");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Gender : " + gender);
		System.out.println("Contact : " + contact);
	}
}
