
public class Interest {

	static double compoundInterest(double principal, double rate, int years) {
		//formula for compound interest
		double total = principal * Math.pow((1 + rate/100), years);
		return total;
		
	}
		public static void main(String[] args) {
		double principal = 5000.00;
		double rate = 4;
		int years = 10;
		double total = compoundInterest(principal,rate, years);
		System.out.println("The compound interest for a principal of $ " + principal + " with an interest rate of " + rate + " per cent a year over a period of " + years + " years is : " + total);
		
	}

}
