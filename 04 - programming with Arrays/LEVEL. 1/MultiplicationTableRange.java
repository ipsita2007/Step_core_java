
import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to generate multiplication table (6 to 9): ");
        int number = sc.nextInt();
        int[] multiplicationResult = new int[40];

        for (int i = 6; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                multiplicationResult[(i - 6) * 10 + (j - 1)] = i * j;
            }
        }

        for (int i = 0; i < multiplicationResult.length; i++) {
            int iRow = i / 10 + 6;
            int iCol = i % 10 + 1;
            System.out.println(iRow + " * " + iCol + " = " + multiplicationResult[i]);
        }
        sc.close();
    }

}
