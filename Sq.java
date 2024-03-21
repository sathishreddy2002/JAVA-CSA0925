import java.util.*;
class Sq
{
public static void main(String[] args)
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();
int k=1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(k*k+" ");
k++;
}
System.out.println();
}
}
}
17. Write a program for matrix addition?
import java.util.*;
class AddMatrix
{
public static void main(String[] args)
{
int i,j;
int a[][]=new int[2][2];
int b[][]=new int[2][2];
int c[][]=new int[2][2];
Scanner sc=new Scanner(System.in);
System.out.println("enter the 1st matrix");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("enter the 2st matrix");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
b[i][j]=sc.nextInt();
}
}
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}
System.out.println("addition matrix");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.print(c[i][j] + "");
}
System.out.println();
}
}
}
