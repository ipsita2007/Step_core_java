
import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);


        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 or negative number to stop): ");
            double userInput = scanner.nextDouble();

            if (userInput <= 0) {
                break;
            }

            total += userInput;
        }


        System.out.println("The total sum is: " + total);


        scanner.close();
    }
}

