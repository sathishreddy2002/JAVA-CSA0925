import java.util.*;
class Simple
{
public static void main(String[] args)
{
int p,n,r;
float si;
Scanner sc=new Scanner(System.in);
System.out.println("enter the p value");
p=sc.nextInt();
System.out.println("enter the n value");
n=sc.nextInt();
System.out.println("enter the r value");
r=sc.nextInt();
si=p*n*r/100;
System.out.println("the simple interest:"+si);
}
}