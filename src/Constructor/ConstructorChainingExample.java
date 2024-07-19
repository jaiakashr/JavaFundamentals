package Constructor;

class Students{

	//data members
	private int studentId;
	private String studentName;
	private int studentAge;
	
	public Students() {
		this(101,"hari",23);
		studentId = 100;
		studentName = "Akash";
		studentAge = 20;
	}
	
	public Students(int studentId, String studentName, int studentAge) {
		this(102, 20, "akash");
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	
	public Students(int studentId,  int studentAge, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	
	public void displayDetails() {
		System.out.println("Student ID : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Student Age : " + studentAge);
	}	
}

public class ConstructorChainingExample {
	
	public static void main(String[] args) {
		
		Students students = new Students();
		students.displayDetails();
		
		System.out.println("***************************************");
		
		
	}
}
