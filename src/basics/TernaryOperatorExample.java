package basics;

public class TernaryOperatorExample {
	public static void main(String[] args) {
		boolean isAuthenticated = true;
		
		if(isAuthenticated)
			System.out.println("You are logged in Successfully.");
		else 
			System.out.println("You are not-logged in.");
		
		String result = (isAuthenticated) ? "Loggedin" : "Not LoggedIn";
		System.out.println(result);
		
	}
}
