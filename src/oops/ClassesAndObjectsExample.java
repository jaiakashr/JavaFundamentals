package oops;

import java.util.Scanner;

class Student{
	
	//data members
	int studentId;
	String studentName;
	int studentAge;
	Scanner scan = new Scanner(System.in);
	
	//member function
	public void acceptDetails() {
		System.out.print("Enter Student ID : ");
		studentId = scan.nextInt();
		System.out.print("Enter Student Name : ");
		studentName = scan.next();
		System.out.print("Enter Student Age : ");
		studentAge = scan.nextInt();
		
	}
	
	public void displayDetils() {
		System.out.println("Student ID : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Student Age : " + studentAge);
	}
}

public class ClassesAndObjectsExample {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.acceptDetails();
		student.displayDetils();
		
		Student student1 = new Student();
		student.acceptDetails();
		student.displayDetils();
	}

}
