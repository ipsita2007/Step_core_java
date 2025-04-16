import java.util.Scanner;
 
public class TriangleArea {
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in); // Scanner object for user input
    	System.out.print("Enter the base of the triangle (in inches): ");
    	double base = input.nextDouble();
    	System.out.print("Enter the height of the triangle (in inches): ");
    	double height = input.nextDouble();
    	double areaInches = 0.5 * base * height;
    	double areaCm = areaInches * (2.54 * 2.54);
    	System.out.println("The area of the triangle is " + areaInches + " square inches and " + areaCm + " square centimeters.");
 
    	input.close();
	}
}

