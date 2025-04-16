import java.util.Scanner;
 
public class ChocolateDivision {
 
	public static int[] findRemainderAndQuotient(int number, int divisor) {
    	int quotient = number / divisor;
    	int remainder = number % divisor;
    	return new int[]{quotient, remainder};
	}
 
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
 
        System.out.print("Enter the number of chocolates: ");
    	int numberOfChocolates = input.nextInt();
 
        System.out.print("Enter the number of children: ");
    	int numberOfChildren = input.nextInt();
 
    	int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
 
        System.out.println("\nEach child will get " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);
 
    	input.close();
	}
}

