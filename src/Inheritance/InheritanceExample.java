package Inheritance;

import java.util.Scanner;

class Student{
	
	//data members
	int studentId;
	String studentName;
	int studentAge;
	Scanner scan = new Scanner(System.in);
	
	//member function
	void acceptDetails() {
		System.out.print("Enter Student ID : ");
		studentId = scan.nextInt();
		System.out.print("Enter Student Name : ");
		studentName = scan.next();
		System.out.print("Enter Student Age : ");
		studentAge = scan.nextInt();
		
	}
	
	void displayDetils() {
		System.out.println("Student ID : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Student Age : " + studentAge);
	}
}

class Marks extends Student{
	protected float objectiveMarks;
	protected float subjectiveMarks;
	void acceptDetails() {
		super.acceptDetails();
		System.out.print("Enter Objective Marks : ");
		objectiveMarks = scan.nextFloat();
		System.out.print("Enter Subjective Marks : ");
		subjectiveMarks = scan.nextFloat();
	}
	void displayDetils() {
		super.displayDetils();
		System.out.println("ObjectiveMarks is : " + objectiveMarks);
		System.out.println("SubjectiveMarks is : " + subjectiveMarks);
	}
}

class Sports extends Marks{
	protected float score;
	void acceptDetails() {
		super.acceptDetails();
		System.out.print("Enter Sports Score : ");
		score = scan.nextFloat();
	}
	void displayDetils() {
		super.displayDetils();
		System.out.println("Sports Score is : " + score);
	}
}

class Result extends Sports{
	private float totalMarks, averageMarks;
	void calculate() {
		totalMarks = objectiveMarks+subjectiveMarks+score;
		averageMarks = totalMarks / 3;
		System.out.println("Total Marks : " + totalMarks);
		System.out.println("Average Marks : " + averageMarks);
	}
}

public class InheritanceExample {
	
	public static void main(String[] args) {
		
		Result obj = new Result();
		obj.acceptDetails();;
		//marks.acceptDetails1();
		System.out.println("***********************************");
		obj.displayDetils();
		//marks.displayDetils1();
		obj.calculate();
		
	}
}
