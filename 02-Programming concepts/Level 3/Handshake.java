
import java.util.Scanner;
public class Handshake
{
public static void main(String[] args)
{
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter the number of students: ");
  int numberOfStudents = scanner.nextInt();
  int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) /2;
  System.out.println("The maximum number of possible handshakes is: "+ maxHandshakes);
}
}

