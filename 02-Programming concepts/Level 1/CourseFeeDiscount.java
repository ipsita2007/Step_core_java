public class CourseFeeDiscount {

    public static void main(String[] args) {
        
        double originalFee = 125000;
        double discountPercentage = 10;

                double discountAmount = (originalFee * discountPercentage) / 100;

               double discountedPrice = originalFee - discountAmount;

               System.out.println(&quot;Original Fee: INR &quot; + originalFee);
        System.out.println(&quot;Discount Amount: INR &quot; + discountAmount);
        System.out.println(&quot;Discounted Price: INR &quot; + discountedPrice);
    }
}