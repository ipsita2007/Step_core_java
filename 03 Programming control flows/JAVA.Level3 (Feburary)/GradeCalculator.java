
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter marks for Physics: ");
        int physics = scanner.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = scanner.nextInt();
        System.out.print("Enter marks for Maths: ");
        int maths = scanner.nextInt();
        
        double total = physics + chemistry + maths;
        double average = total / 3;
        
        System.out.println("Average Marks: " + average);
        
        if (average >= 90) {
            System.out.println("Grade: A");
            System.out.println("Remarks: Excellent");
        } else if (average >= 75) {
            System.out.println("Grade: B");
            System.out.println("Remarks: Good");
        } else if (average >= 50) {
            System.out.println("Grade: C");
            System.out.println("Remarks: Average");
        } else {
            System.out.println("Grade: D");
            System.out.println("Remarks: Needs Improvement");
        }
    }
}

