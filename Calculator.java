import java.lang.Math;
import java.util.Scanner;

public class Calculator {
	
	static double volumeOfSphere(double radius) {
		final double PI = 3.14;
		double volume = (4/3) * PI * Math.pow(radius, 3);
		return volume;
	}

	static double radius(double diameter) {
		double radius = diameter/2;
		return radius;
	}
	
	static double ratio(double vol1, double vol2) {
		double ratio = vol1/vol2;
		return ratio;
	}
	
	public static void main(String[] args) {
		final double DIAMETER_SUN = 865000;
		final double DIAMETER_EARTH = 7600;
		
		double radiusSun = radius(DIAMETER_SUN);
		double radiusEarth = radius(DIAMETER_EARTH);
		
		double volumeEarth = volumeOfSphere(radiusEarth);
		System.out.println("The volume of the Earth is " + volumeEarth + " in cubic miles");
		double volumeSun = volumeOfSphere(radiusSun);
		System.out.println("The volume of the Sun is " + volumeSun + " in cubic miles");
		double ratioSunToEarth = ratio(volumeSun, volumeEarth);
		System.out.println("The ratio of the volume Sun to the volume of the Earth is " + ratioSunToEarth);
			
	}

}