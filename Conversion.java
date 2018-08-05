import java.util.Scanner;

public class Conversion {

	static double toFahrenheit(double celsius) {
		//Celsius to Fahrenheit conversion formula
		double fahrenheit = celsius * 9/5 + 32; 
		return fahrenheit;
	}
	
	static String lines() {
		String line = "==============================================================";
		return line;
	}
	public static void main(String[] args) {
		System.out.println(lines());
		System.out.println("This program transforms a temperature in Celsius to Fahrenheit.");
		System.out.println(lines());
		System.out.println("Insert the temperature you want to convert: ");
		Scanner scan = new Scanner(System.in);
		double celsius = scan.nextDouble();
		System.out.println("The temperature is " + toFahrenheit(celsius) + " F");

	}

}
