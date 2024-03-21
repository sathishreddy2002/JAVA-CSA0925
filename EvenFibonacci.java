import java.util.Scanner;
class EvenFibonacci
 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number N: ");
        int N = scanner.nextInt();
        System.out.println("Sum of even Fibonacci numbers up to " + N + ": " + evenFibonacciSum(N));
        scanner.close();
    }
      public static int evenFibonacciSum(int N) 
{
        int sum = 0;
        int prev = 0;
        int curr = 1;
        while (curr <= N) 
{
            if (curr % 2 == 0)
 {
                sum += curr;
            }
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return sum;
    }
}
