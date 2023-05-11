import java.util.Scanner;
public class markscalculation 
{
    public static void main(String args[])
    {
    System.out.println("enter your marks of 4 subjects");
    Scanner sc = new Scanner(System.in);
    System.out.println("enter marks of subject-1");
    float a = sc.nextFloat();
    System.out.println("enter marks of subject-2");
    float b = sc.nextFloat();
    System.out.println("enter marks of subject-3");
    float c = sc.nextFloat();
    System.out.println("enter marks of subject-4");
    float d = sc.nextFloat();
    float total = (a+b+c+d);
    float percentage = (total/400)*100;
    System.out.println("the percentage is"+percentage);
    }
}
