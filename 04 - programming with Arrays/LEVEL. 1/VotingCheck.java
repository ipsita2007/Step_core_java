import java.util.Scanner;

public class VotingCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            if (ages[i] < 0) {
                System.out.println("Invalid age.");
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
        sc.close();
    }
}

