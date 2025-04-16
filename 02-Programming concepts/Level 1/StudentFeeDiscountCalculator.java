import java.util.Scanner;

public class StudentFeeDiscountCalculator {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
                System.out.print(&quot;Enter the original student fee (in INR): &quot;);
        double originalFee = scanner.nextDouble();
        
               System.out.print(&quot;Enter the discount percentage: &quot;);
        double discountPercentage = scanner.nextDouble();
        
                double discountAmount = (originalFee * discountPercentage) / 100;
        

                double discountedPrice = originalFee - discountAmount;
        
              System.out.println(&quot;Original Fee: INR &quot; + originalFee);
        System.out.println(&quot;Discount Amount: INR &quot; + discountAmount);
        System.out.println(&quot;Discounted Price: INR &quot; + discountedPrice);
        
                scanner.close();
    }
}