import java.util.Scanner;
 
public class SpringSeason {
 
	static boolean isSpringSeason(int month, int day) {
    	if (month == 3 && day >= 20) {
        	return true;
    	} else if (month == 4 || month == 5) {
        	return true;
    	} else if (month == 6 && day <= 20) {
        	return true;
    	} else {
        	return false;
    	}
	}
 
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
 
        System.out.print("Enter month (1-12): ");
    	int month = input.nextInt();
 
        System.out.print("Enter day: ");
    	int day = input.nextInt();
 
    	if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
    	} else {
            System.out.println("Not a Spring Season");
    	}
 
    	input.close();
	}
} 

