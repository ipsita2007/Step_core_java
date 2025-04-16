import java.util.Scanner;
 
public class QuotientRemainder {
 
	public static int[] findRemainderAndQuotient(int number, int divisor) {
    	int quotient = number / divisor;
    	int remainder = number % divisor;
    	return new int[]{quotient, remainder};
	}
 
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
 
        System.out.print("Enter the dividend: ");
    	int number = input.nextInt();
 
        System.out.print("Enter the divisor: ");
    	int divisor = input.nextInt();
 
    	int[] result = findRemainderAndQuotient(number, divisor);
 
        System.out.println("\nThe Quotient is " + result[0]);
        System.out.println("The Remainder is " + result[1]);
 
    	input.close();
	}
}

