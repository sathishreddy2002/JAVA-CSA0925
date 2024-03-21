import java.util.Scanner;
 class PositiveNegative
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
         int[] numbers = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("Positive numbers:");
        for (int number : numbers) {
            if (number > 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
        
        System.out.println("Negative numbers:");
        for (int number : numbers) {
            if (number < 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
        
        scanner.close();
    }
}
