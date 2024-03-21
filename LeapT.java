import java.util.*;
class LeapT
{
public static void main(String[] args)
{
int year=2000;
String result=(year%4==0)? is a leap year:" : ":is not a leap year:"; 
System.out.println(year+" "+result);
}
}