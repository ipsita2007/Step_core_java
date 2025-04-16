
import java.math.BigInteger;

public class NumberChecker {

    public static int[] findFactors(int number) {
        int[] factors = new int[number / 2];          int count = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                factors[count++] = i;              }
        }

        int[] result = new int[count];
        System.arraycopy(factors, 0, result, 0, count);
        return result;
    }

    public static int greatestFactor(int number) {
        int[] factors = findFactors(number);    }

       public static int sumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int number) {
        int[] factors = findFactors(number);
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double productOfCubesOfFactors(int number) {
        int[] factors = findFactors(number);
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);          }
        return product;
    }

    public static boolean isPerfectNumber(int number) {
        return sumOfFactors(number) == number;
    }

    public static boolean isAbundantNumber(int number) {
        return sumOfFactors(number) > number;
    }

    public static boolean isDeficientNumber(int number) {
        return sumOfFactors(number) < number;
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }


    public static boolean isStrongNumber(int number) {
        int sumOfFactorials = 0;
        int originalNumber = number;

        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit);              number /= 10;
        }

        return sumOfFactorials == originalNumber;
    }

    public static void main(String[] args) {
        int[] testNumbers = {6, 12, 28, 18, 145};  
        for (int number : testNumbers) {
            System.out.println("Checking number: " + number);
            System.out.println("Factors: ");
            int[] factors = findFactors(number);
            for (int factor : factors) {
                System.out.print(factor + " ");
            }
            System.out.println();

            System.out.println("Greatest Factor: " + greatestFactor(number));
            System.out.println("Sum of Factors: " + sumOfFactors(number));
            System.out.println("Product of Factors: " + productOfFactors(number));
            System.out.println("Product of Cubes of Factors: " + productOfCubesOfFactors(number));
            System.out.println("Is Perfect Number: " + isPerfectNumber(number));
            System.out.println("Is Abundant Number: " + isAbundantNumber(number));
            System.out.println("Is Deficient Number: " + isDeficientNumber(number));
            System.out.println("Is Strong Number: " + isStrongNumber(number));
            System.out.println("-----------------------------------");
        }
    }
}

