import java.util.Scanner;
 
public class TrigonometricCalculator {
 
	public static double[] calculateTrigonometricFunctions(double angle) {
    	double radians = Math.toRadians(angle);
    	double sine = Math.sin(radians);
    	double cosine = Math.cos(radians);
    	double tangent = Math.tan(radians);
    	return new double[]{sine, cosine, tangent};
	}
 
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
 
        System.out.print("Enter angle in degrees: ");
    	double angle = input.nextDouble();
 
    	double[] result = calculateTrigonometricFunctions(angle);
 
        System.out.println("\nSine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);
 
    	input.close();
	}
}

