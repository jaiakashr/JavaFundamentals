package conditions;

public class IfStatementExample {
	
	public static void main(String[] args) {
		
		boolean isAuthenticated = true;
		
		if(isAuthenticated)
			System.out.println("LoggedIn");
		if(isAuthenticated)
			System.out.println("Not LoggedIn");
	}
}
