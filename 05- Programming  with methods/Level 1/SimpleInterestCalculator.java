 import java.util.Scanner;
 
public class SimpleInterestCalculator {
 
	static double calculateInterest(double principal, double rate, double time) {
    	return (principal * rate * time) / 100;
	}
 
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
 
        System.out.print("Enter Principal: ");
    	double principal = input.nextDouble();
 
        System.out.print("Enter Rate of Interest: ");
    	double rate = input.nextDouble();
 
        System.out.print("Enter Time (in years): ");
    	double time = input.nextDouble();
 
    	double interest = calculateInterest(principal, rate, time);
 
        System.out.println("\nThe Simple Interest is " + interest + " for Principal " +
                principal + ", Rate of Interest " + rate + " and Time " + time);
 
    	input.close();
	}
}
