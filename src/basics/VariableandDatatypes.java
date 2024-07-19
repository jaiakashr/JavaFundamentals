package basics;


import java.util.Date;

public class VariableandDatatypes {
	public static void main(String args[]) {
		byte age =23;
		long viewscount = 1_223_445_667;
		float price = 223.456f;
		char gender = 'M';
		boolean idValid = true;
		System.out.println(age);
		System.out.println(viewscount);
		System.out.println(price);
		System.out.println(gender);
		System.out.println(idValid);
		
		String name = "king kocharr";
		System.out.println(name);
		Date now = new Date();
		System.out.println(now);
		
	//  Point point1 = new Point(10,20);
	//	Point point2 = point1;
	//  System.out.println(point1.x + " : " + point1.y);
	//	System.out.println(point2.x + " : " + point1.y);
		
	}
}
