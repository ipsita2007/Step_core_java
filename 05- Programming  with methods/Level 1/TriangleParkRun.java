
import java.util.Scanner;
 
public class TriangleParkRun {
 
    static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return (int) Math.ceil(5000 / perimeter);
	}
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter side 1 of the triangle in meters: ");
        double side1 = input.nextDouble();
 
        System.out.print("Enter side 2 of the triangle in meters: ");
        double side2 = input.nextDouble();
 
        System.out.print("Enter side 3 of the triangle in meters: ");
        double side3 = input.nextDouble();
 
        int rounds = calculateRounds(side1, side2, side3);
 
        System.out.println("\nThe athlete needs to complete " + rounds + " rounds to cover 5 km.");
 
        input.close();
	}
}

