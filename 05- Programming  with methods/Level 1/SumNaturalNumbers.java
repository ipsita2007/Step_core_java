 import java.util.Scanner;
 
public class SumNaturalNumbers {
 
	static int calculateSum(int n) {
    	int sum = 0;
    	for (int i = 1; i <= n; i++) {
        	sum += i;
    	}
    	return sum;
	}
 
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
 
        System.out.print("Enter the value of n: ");
    	int n = input.nextInt();
 
    	int sum = calculateSum(n);
 
        System.out.println("\nThe sum of first " + n + " natural numbers is " + sum);
 
    	input.close();
	}
}

