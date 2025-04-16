import java.util.Scanner;
public class Fahrenheit
{
public static void main(String[] args)
{
 Scanner scanner = new Scanner (System.in);
 System.out.println("enter the fahrenheit : ");
 double fahrenheit = scanner.nextDouble();
 double celcius = (fahrenheit - 32) * 5/9;
 System.out.println("The " + fahrenheit + " fahrenheit is " + celcius + "celcius");
}

}
