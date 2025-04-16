
import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();

        while (counter > 0) {
            System.out.println("T-" + counter + " seconds");
            counter--; 
        }

               System.out.println("Liftoff!");
        
              scanner.close();
    }
}

