import java.util.Scanner;
public class DigitFrequency {
	public static void main (string[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		int[]frequency = new int[10];
		int temp = number;
		while(temp!=0) {
			int digit = temp%10;
			freqency[digit]++;
			temp/=10;
		}
	}
    System.out.prinln("\nDigit Frequency in "+number+ ":");
	for (int i=0;i<10;i++){
if ([frequencyi]>0) {
System.out.prinln("Digit"+i+":" +frequency[i]+ "times");
}
	}
	input.close();
}
} 
	
		
