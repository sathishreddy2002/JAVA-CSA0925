import java.util.*;
class P2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, k;
        System.out.println("Enter the number:");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(i);
}
System.out.println();
}
for(i=n-1;i>=1;i--)
{
for(j=1;j<=i;j++)
{
System.out.print(i);
}

System.out.println();
}
}
}
