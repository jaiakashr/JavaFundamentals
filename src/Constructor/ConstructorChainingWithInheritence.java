package Constructor;

class Person{
	String name;
	public Person() {
		System.out.println("Person Class Constructor Invoked. ");
		name = "King Chola";
	}
	public Person(String name) {
		System.out.println("Person Class Perameterized Constructor Invoked. ");
		this.name = name;
	}
}

class Employee extends Person{
	String designation;
	public Employee() {
		System.out.println("Employee Class Constructor Invoked. ");
		designation = "Manager";
	}
	public Employee(String designation) {
		//super("hari");
		System.out.println("Employee Class Parameterized Constructor Invoked. ");
		this.designation = designation;
		
	}
}

public class ConstructorChainingWithInheritence {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		Employee employee1 = new Employee("Senior Manager");
		
		
	}

}
