import java.util.Scanner;

 public class LeapYearChecker {

 	public static void main(String[] args) {
     	Scanner scanner = new Scanner(System.in);
    	
     	System.out.print("Enter a year (>= 1582): ");
     	int year = scanner.nextInt();
     	
   	
     	if (year < 1582) {
         	System.out.println("Please enter a year greater than or equal to 1582.");
         	return;
     	}
     	
    	
     	if (isLeapYear(year)) {
         	System.out.println(year + " is a Leap Year.");
     	} else {
         	System.out.println(year + " is not a Leap Year.");
     	}
     	
     	scanner.close();
 	}

   
 	public static boolean isLeapYear(int year) {
     	
     	return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
 	}
 }

