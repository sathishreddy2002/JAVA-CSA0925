import java.util.*;
class Quotient
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the dividend:");
int dividend=sc.nextInt();
System.out.println("enter the divisor:");
int divisor=sc.nextInt();
int quotient=dividend/divisor;
int remainder=dividend%divisor;
System.out.println("quotient:"+quotient);
System.out.println("remainder:"+remainder);
}
}