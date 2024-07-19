package Constructor;

import java.util.Scanner;

class Student{
	
	//data members
	private int studentId;
	private String studentName;
	private int studentAge;
	Scanner scan = new Scanner(System.in);
	
	public Student() {
		studentId = 100;
		studentName = "Akash";
		studentAge = 20;
	}
	
	public Student(int studentId, String studentName, int studentAge) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	
	public void displayDetils() {
		System.out.println("Student ID : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Student Age : " + studentAge);
	}
}

public class constructorsExample {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.displayDetils();
		
		Student student1 = new Student(2203,"Abi",20);
		student1.displayDetils();
		
	}
}
