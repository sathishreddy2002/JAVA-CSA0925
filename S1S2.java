import java.util.*;
class S1S2
{
public static void main(String[] args)
{
String s1;
String s2;
Scanner sc=new Scanner(System.in);
System.out.println(" enter the username s1");
s1=sc.nextLine();
System.out.println("reenter the username s2");
s2=sc.nextLine();
if(s1.equals(s2))
{
System.out.println("username valid");
}
else
{
System.out.println("username not valid");
}
} 
}
