class MulMatrix
{
public static void main(String[] args)
{
int i,j,k;
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
for(k=0;k<2;k++)
{
c[i][j]=a[i][k]*b[k][j];
}
}
}
System.out.println("mul matrix");
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