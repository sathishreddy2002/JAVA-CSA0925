import java.util.Scanner;
class Factorial
 {
  public static void main(String[] args)
 {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Factorial of " + n + ": " + factorial(n));
        scanner.close();
    }

    public static long factorial(int n) 
{
        if (n < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        long result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }
}
