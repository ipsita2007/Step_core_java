
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        if (number > 0) {

            int sumFormula = (number * (number + 1)) / 2;


            int sumLoop = 0;
            for (int i = 1; i <= number; i++) {
                sumLoop += i;
            }


            System.out.println("Sum using the formula: " + sumFormula);
            System.out.println("Sum using the for loop: " + sumLoop);


            if (sumFormula == sumLoop) {
                System.out.println("Both methods give the same result.");
            }
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }

        scanner.close();
    }
}

