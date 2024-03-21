import java.util.Scanner;
 class ReverseAndAddPalindrome
 {
    public static void main(String[] args)
 {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Palindrome obtained: " + reverseAndAddPalindrome(number));
        scanner.close();
    }

    public static int reverseAndAddPalindrome(int number)
 {
        while (!isPalindrome(number))
 {
            int reversedNumber = reverseNumber(number);
            number += reversedNumber;
        }
        return number;
    }

    public static boolean isPalindrome(int number)
 {
        return number == reverseNumber(number);
    }

    public static int reverseNumber(int number)
 {
        int reversedNumber = 0;
        while (number != 0) 
{
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
}
