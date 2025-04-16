import java.util.Scanner;
public class Cities
{
public static void main(String[] args)
{
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter your name: ");
  String name = scanner.nextLine();
  System.out.print("Enter the starting city (From City): ");
  String fromCity = scanner.nextLine();
  System.out.print("Enter the via city: ");
  String viaCity = scanner.nextLine();
  System.out.print("Enter the destination city (To City): ");
  String toCity = scanner.nextLine();
  System.out.print("Enter the distance from " + fromCity + " to " +
  viaCity + " (in miles): ");
  double fromToViaDistance = scanner.nextDouble();
  System.out.print("Enter the distance from " + viaCity + " to " +
  toCity + " (in miles): ");
  double viaToFinalCityDistance = scanner.nextDouble();
  System.out.print("Enter the time taken for the trip from " +
  fromCity + " to " + viaCity + " (in hours): ");
  int hoursFromToVia = scanner.nextInt();
  System.out.print("Enter the time taken for the trip from " +
  fromCity + " to " + viaCity + " (in minutes): ");
  int minutesFromToVia = scanner.nextInt();
  System.out.print("Enter the time taken for the trip from " +
  viaCity + " to " + toCity + " (in hours): ");
  int hoursViaToFinal = scanner.nextInt();
  System.out.print("Enter the time taken for the trip from " +
  viaCity + " to " + toCity + " (in minutes): ");
  int minutesViaToFinal = scanner.nextInt();
  double totalDistance = fromToViaDistance + viaToFinalCityDistance;
  int totalHours = hoursFromToVia + hoursViaToFinal;
  int totalMinutes = minutesFromToVia + minutesViaToFinal;
  if (totalMinutes >= 60) {
  totalHours += totalMinutes / 60;
  totalMinutes = totalMinutes % 60;
  }
  System.out.println("\nTravel Details for " + name + ":");
  System.out.println("From City: " + fromCity);
  System.out.println("Via City: " + viaCity);
  System.out.println("To City: " + toCity);
  System.out.println("Total Distance: " + totalDistance + " miles");
  System.out.println("Total Time: " + totalHours + " hours and " +
  totalMinutes + " minutes");
}
}

