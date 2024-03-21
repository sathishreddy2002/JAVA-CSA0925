import java.util.*;
class ReverseString
{
public String str;
String rev=" ";
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("enter the string ");
str=sc.nextLine();
int n=str.length();
for(int i=n-1;i>=0;i--)
{
 ch=str.charAt(i);
 rev=rev+ch;
}
System.out.println("reverse word:"+rev);
}
}
