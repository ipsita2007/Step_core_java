import java.util.Scanner;
public class Salary
{
public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("enter your salary : ");
  int salary = sc.nextInt();
  System.out.println("enter the bonus : ");
  int bonus = sc.nextInt();
  int totalsalary = (salary + bonus);
  System.out.println("Salary: "+salary+" Bonus : "+bonus+" TOTAL SALARY :"+totalsalary);
}
}