import java.util.Scanner;
public class Temperature{
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
 
    	System.out.println("Enter the temperature in Celsius: ");
    	double celsius = sc.nextDouble();
 
    	double fahrenheit = (celsius * (9.0/5)) + 32;
 
    	System.out.printf("Temperature in Fahrenheit:  degree fahrenheit \n"+fahrenheit);
	}
}

