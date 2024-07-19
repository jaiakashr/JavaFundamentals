package Polymorphism;

class Student{

	//data members
	private int studentId;
	private String studentName;
	private int studentAge;
	
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
	
	public Student(int studentId,  int studentAge, String studentName) {
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

public class ConstructorOverloadingExample {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.displayDetils();
		
		System.out.println("***************************************");
		
		Student student1 = new Student(2203,20,"Akash");
		student1.displayDetils();
		
		System.out.println("***************************************");
		
		Student student2 = new Student(2204,"Nirmal",20);
		student2.displayDetils();
		
		System.out.println("***************************************");
	}
}
