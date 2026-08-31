import java.util.Scanner;

/**
 * OddEvenArrays.java
 * Saves odd and even numbers into separate arrays between 1 and the user-entered number.
 */
public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (>=1): ");
        if (!scanner.hasNextInt()) {
            System.err.println("Invalid input. Expected a positive integer. Exiting.");
            scanner.close();
            return;
        }
        int number = scanner.nextInt();
        if (number < 1) {
            System.err.println("Invalid number. Expected a natural number (>=1). Exiting.");
            scanner.close();
            return;
        }

        // Max possible counts: evens = number/2, odds = (number+1)/2; allocate safely
        int maxEven = number / 2 + 1;
        int maxOdd = number / 2 + 1; // safe upper bound
        int[] evens = new int[maxEven];
        int[] odds = new int[maxOdd];
        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evens[evenIndex++] = i;
            } else {
                odds[oddIndex++] = i;
            }
        }

        System.out.println("Even numbers up to " + number + ":");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evens[i] + (i < evenIndex - 1 ? ", " : "\n"));
        }

        System.out.println("Odd numbers up to " + number + ":");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odds[i] + (i < oddIndex - 1 ? ", " : "\n"));
        }

        scanner.close();
    }
}
