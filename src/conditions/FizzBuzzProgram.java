package conditions;

import java.util.Scanner;

public class FizzBuzzProgram {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char continueloop;
		
		do {
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		
		for(int i = 1; i<=num; i++) {
			if(i%5 == 0 && i%3 == 0)
				System.out.println("FizzBuzz ");
			else if(i%3 == 0)
				System.out.println("Fizz ");
			else if(i%5 == 0)
				System.out.println("Buzz ");
			else
				System.out.println(i + " ");
		}
		System.out.println("Do you want to continue again(Yes/No) : ");
		continueloop = scan.next().charAt(0);
		}
		while(continueloop == 'Y' || continueloop == 'y');
		
		scan.close();
	
	}

}
	