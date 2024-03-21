import java.util.*;
class Vowels
{
public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);
String str;
String vowels=" ";
String consonants=" ";
System.out.println("enter the string");
str=sc.nextLine();
int Vcount=0,Ccount=0;
int n=str.length();
for(int i=0;i<n;i++)
{
  char ch=str.charAt(i);
   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
  vowels+=ch+" ";
   Vcount++;
}
else if(ch>='a'&& ch<='z')
{
 consonants+=ch+" ";
 Ccount++;
}
}
System.out.println("vowels"+vowels);
System.out.println("no of vowels:"+Vcount);
System.out.println("Consonants"+consonants);
System.out.println("no of consonants:"+Ccount);
}
}
