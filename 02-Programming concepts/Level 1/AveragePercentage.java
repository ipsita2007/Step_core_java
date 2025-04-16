public class AveragePercentage {
    public static void main(String[] args) {
        
        int mathsMark = 94;
        int physicsMark = 95;
        int chemistryMark = 96;
        
        int totalMarks = 100;
        
        int totalObtainedMarks = mathsMark + physicsMark + chemistryMark;
        
        double averagePercentage = (totalObtainedMarks / 3.0) / totalMarks * 100;
        
        System.out.println(&quot;Sam&#39;s average percentage mark in PCM is: &quot; + averagePercentage + &quot;%&quot;);
    }