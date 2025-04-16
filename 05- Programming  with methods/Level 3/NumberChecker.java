
import java.util.Arrays;

class NumberChecker {

    // Method to count digits in a number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store digits of the number into an array
    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to check if a number is a Duck Number
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigits(number);
        for (int digit : digits) {
            if (digit == 0) {
                return true; // Duck Number contains zero
            }
        }
        return false;
    }

    // Method to check if a number is an Armstrong Number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigits(number);
        int sum = 0;
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    // Method to find largest and second largest elements in digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        return new int[]{largest, secondLargest};
    }

    public static void main(String[] args) {
        int number = 153; // Sample number for testing
        int[] digits = getDigits(number);

        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Is Duck Number: " + isDuckNumber(number));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number));

        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit: " + largestAndSecondLargest[0]);
        System.out.println("Second Largest Digit: " + largestAndSecondLargest[1]);
    }
}

