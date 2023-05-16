import java.util.Scanner;
public class factorial 
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number of which you want to calculate the factorial");
int number=sc.nextInt();
int fact=1;int i;
for(i=1;i<=number;i++)
{
    fact=fact*i;
}
System.out.println("the factorial of the number is:" +fact);
    
}
}