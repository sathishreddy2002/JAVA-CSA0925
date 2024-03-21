import java.util.Scanner;
 class Reverse
 {
    public static void main(String[] args)
 {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
        String reversedWord = reverseWord(word);
        
        System.out.println("Reversed word: " + reversedWord);
        
        scanner.close();
    }
    
    public static String reverseWord(String word) {
        char[] charArray = word.toCharArray();
        int length = charArray.length;
        char[] reversedArray = new char[length];
        
        for (int i = 0; i < length; i++) {
            reversedArray[i] = charArray[length - 1 - i];
        }
        
        return new String(reversedArray);
    }
}
