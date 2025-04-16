import java.util.Scanner;

 public class NaturalNumberSum {

 	public static void main(String[] args) {
     	Scanner scanner = new Scanner(System.in);
     	
     	System.out.print("Enter a natural number: ");
     	int n = scanner.nextInt();
     	
     	if (n < 1) {
         	System.out.println("Please enter a natural number greater than 0.");
         	return;
     	}
     	int recursiveSum = sumOfNaturalNumbers(n);
    	
     	int formulaSum = sumUsingFormula(n);
     	
     	System.out.println("Sum of first " + n + " natural numbers (recursive): " + recursiveSum);
     	System.out.println("Sum of first " + n + " natural numbers (formula): " + formulaSum);
     	
    	
     	if (recursiveSum == formulaSum) {
         	System.out.println("Both methods give the same result. The computation is correct.");
     	} else {
         	System.out.println("The results do not match. There is an error in the computation.");
     	}
     	
     	scanner.close();
 	}
 	public static int sumOfNaturalNumbers(int n) {
     	if (n == 1) {
         	return 1;
     	}
     	return n + sumOfNaturalNumbers(n - 1);
 	}

   
 	public static int sumUsingFormula(int n) {
     	return n * (n + 1) / 2;
 	}
 }

