
public class NumberChecker {

   
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2;
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square != 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    public static boolean isSpy(int number) {
        int sumOfDigits = 0;
        int productOfDigits = 1;
        while (number != 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            number /= 10;
        }
        return sumOfDigits == productOfDigits;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || String.valueOf(number).endsWith("7");
    }

    // Main method to call the different methods and display results
    public static void main(String[] args) {
        int[] testNumbers = {5, 9, 25, 37, 49, 28};        for (int number : testNumbers) {
            System.out.println("Checking number: " + number);
            System.out.println("Is Prime: " + isPrime(number));
            System.out.println("Is Neon: " + isNeon(number));
            System.out.println("Is Spy: " + isSpy(number));
            System.out.println("Is Automorphic: " + isAutomorphic(number));
            System.out.println("Is Buzz: " + isBuzz(number));
            System.out.println("-------------------------------------");
        }
    }
}

