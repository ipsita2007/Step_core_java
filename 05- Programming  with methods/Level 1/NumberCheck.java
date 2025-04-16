import java.util.Scanner;
 
public class NumberCheck {
 
    static int checkNumber(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
	}
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter a number: ");
        int number = input.nextInt();
 
        int result = checkNumber(number);
 
        if (result == 1) {
            System.out.println(number + " is Positive");
        } else if (result == -1) {
            System.out.println(number + " is Negative");
        } else {
            System.out.println(number + " is Zero");
        }
 
        input.close();
	}
}

