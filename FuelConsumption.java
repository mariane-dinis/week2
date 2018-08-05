
public class FuelConsumption {

	static double standardConsumption(double km, double liters){
		double consumption = km/liters;
		return consumption;
	}
	
	static double consumptionRoughRoad(double standardConsumption, double effortRate) {
		double consumptionRough = standardConsumption + (effortRate/100);
		return consumptionRough;
	}
	
	static double distance(double consumption, double liters) {
		double distance = consumption * liters;
		return distance;
	}
	
	static double distanceRough(double distance, double consumptionRough) {
		double distanceRough =  distance - consumptionRough;
		return distanceRough;
	}
	
	public static void main(String[] args) {
		double carConsumption = standardConsumption(100, 8);
		double fullTank = 40;
		double distanceFullTank = distance(carConsumption, fullTank);
		double effortRate = 15;
		double distanceRoughRoad = distanceRough(distanceFullTank, consumptionRoughRoad(carConsumption, effortRate));
		System.out.println("The car will road " + distanceFullTank + " km in normal roads and " + distanceRoughRoad + " in rough roads.");

	}

}
