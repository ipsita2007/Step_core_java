
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = scanner.nextInt();

        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus: " + bonus);
        } else {
            System.out.println("No bonus, service is less than or equal to 5 years.");
        }
    }
}

