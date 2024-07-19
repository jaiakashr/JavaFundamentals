package oops;

class Person{
	private String firstName;
	private String lastName;
	private int age;
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName =firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		if(age >= 18)
			this.age = age;
		else
			System.out.println("Invalid age");
	}
}

public class EncapsulationExample {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.setFirstName("King");
		System.out.println(person.getFirstName());
		person.setLastName("Kochhar");
		System.out.println(person.getLastName());
		person.setAge(18);
		System.out.println(person.getAge());
		
		
	}

}
