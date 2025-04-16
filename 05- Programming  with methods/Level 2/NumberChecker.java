import java.util.Scanner;

 public class NumberChecker {

 	public static boolean isPositive(int number) {
     	return number >= 0;
 	}

 	public static boolean isEven(int number) {
     	return number % 2 == 0;
 	}

 	public static int compare(int number1, int number2) {
     	if (number1 > number2) return 1;
     	if (number1 < number2) return -1;
     	return 0;
 	}

 	public static void main(String[] args) {
     	Scanner scanner = new Scanner(System.in);
     	int[] numbers = new int[5];

     	for (int i = 0; i < numbers.length; i++) {
         	System.out.print("Enter number " + (i + 1) + ": ");
         	numbers[i] = scanner.nextInt();
         	if (isPositive(numbers[i])) {
                 System.out.println(numbers[i] + " is positive.");
             	if (isEven(numbers[i])) {
                     System.out.println(numbers[i] + " is even.");
             	} else {
                     System.out.println(numbers[i] + " is odd.");
             	}
         	} else {
                 System.out.println(numbers[i] + " is negative.");
         	}
     	}

     	int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
     	if (comparisonResult > 0) {
         	System.out.println("First number is greater than last number.");
     	} else if (comparisonResult < 0) {
         	System.out.println("First number is less than last number.");
     	} else {
         	System.out.println("First number is equal to last number.");
     	}

     	scanner.close();
 	}
 }




