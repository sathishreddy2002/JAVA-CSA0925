import java.util.Scanner;
 class LuckyGuess {
    public static void main(String[] args) {
     int luckyNumber = 7;
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess (between 1 and 10): ");
        int guess = scanner.nextInt();
       switch (guess) {
            case 7:
                System.out.println("Congratulations! You guessed the lucky number!");
                break;
            default:
                System.out.println("Sorry, try again! The lucky number was " + luckyNumber);
                break;
        }
        
        scanner.close();
    }
}
