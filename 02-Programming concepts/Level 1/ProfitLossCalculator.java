public class ProfitLossCalculator {
        public static void main(String[] args) {
         double costPrice = 129;
        double sellingPrice = 191;
         double profitOrLoss = sellingPrice - costPrice;

               if (profitOrLoss &gt; 0) {
                       double profitPercentage = (profitOrLoss / costPrice) * 100;
            System.out.println(&quot;Profit: INR &quot; + profitOrLoss);
            System.out.println(&quot;Profit Percentage: &quot; + profitPercentage + &quot;%&quot;);
        } else if (profitOrLoss &lt; 0) {
                        double lossPercentage = (Math.abs(profitOrLoss) / costPrice) * 100;
            System.out.println(&quot;Loss: INR &quot; + Math.abs(profitOrLoss));
            System.out.println(&quot;Loss Percentage: &quot; + lossPercentage + &quot;%&quot;);
        }
 else {
                        System.out.println(&quot;No Profit No Loss.&quot;);
        }

    }
}