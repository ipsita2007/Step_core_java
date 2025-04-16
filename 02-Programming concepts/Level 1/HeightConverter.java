import java.util.Scanner;

public class HeightConverter {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

                System.out.print(&quot;Enter your height in centimeters: &quot;);
        double heightInCm = scanner.nextDouble();

               double heightInInches = heightInCm / 2.54;

               int feet = (int) heightInInches / 12;
        int inches = (int) heightInInches % 12;

                System.out.println(&quot;Your height is &quot; + feet + &quot; feet and &quot; + inches + &quot; inches.&quot;);

               scanner.close();
    }
}