package arrays;

public class MultiDimensionalArrayExample {
	
	public static void main(String[] args) {
		
		int[][] marks = {
				{67,76,87,89,98},
				{76,77,78,79,76},
				{56,98,89,80,79}};
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<5; j++) {
				System.out.print(marks[i][j] + "\t");
			}
			System.out.println();
		}
	}
}