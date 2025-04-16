
import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int amarAge = scanner.nextInt();
        System.out.print("Enter Amar's height: ");
        double amarHeight = scanner.nextDouble();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Enter Akbar's height: ");
        double akbarHeight = scanner.nextDouble();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scanner.nextInt();
        System.out.print("Enter Anthony's height: ");
        double anthonyHeight = scanner.nextDouble();


        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngestFriend = (youngestAge == amarAge) ? "Amar" : (youngestAge == akbarAge) ? "Akbar" : "Anthony";


        double tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallestFriend = (tallestHeight == amarHeight) ? "Amar" : (tallestHeight == akbarHeight) ? "Akbar" : "Anthony";

        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);
    }
}

