import java.util.Scanner;


public class Circle {

	static double area (double radius){
		//setting PI as a constant
		final double PI = 3.14; 
		//formula for the area of the circle
		double area = (PI)* Math.pow(radius, 2);
		return area;
	}
	
	static String lines() {
		String line = "============================================";
		return line;
	}
	
	public static void main(String[] args) {
		System.out.println(lines());
		System.out.println("This program calculate the area of a circle. ");
		System.out.println(lines());
		System.out.println("Insert the radius: ");
		Scanner scan = new Scanner(System.in);
		double radius = scan.nextDouble();
		System.out.println("The area of the circle is " + area(radius));

	}

}

