import java.util.*;
class Compositie {
    public static void main(String[] args) {
        int[] a = new int[7];
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements");
        for (i = 0; i < 7; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < 7; i++) {
            int count = 0;
            for (j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    count++;
                }
            }
            if (count > 2) {
                System.out.println(a[i] + " is a composite number.");
            }
        }
    }
}
