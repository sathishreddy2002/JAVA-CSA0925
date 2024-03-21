import java.util.*;
class VowelsCount
{
public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);
String str;
System.out.println("enter the string");
str=sc.nextLine();
int Vcount=0;
int n=str.length();
for(int i=0;i<n;i++)
{
  char ch=str.charAt(i);
   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
   Vcount++;
}
}
System.out.println("no of vowels:"+Vcount);

}
}
