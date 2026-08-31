import java.util.Scanner;

/**
 * PosNegEvenOdd.java
 * Reads 5 integers, reports positive/negative/zero and even/odd for positives.
 * Compares first and last elements.
 */
public class PosNegEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 5;
        int[] numbers = new int[SIZE];

        System.out.println("Enter " + SIZE + " integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            if (!scanner.hasNextInt()) {
                System.err.println("Invalid input. Expected an integer. Exiting.");
                scanner.close();
                return;
            }
            numbers[i] = scanner.nextInt();
        }

        // Analyze each number
        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            if (n > 0) {
                String parity = (n % 2 == 0) ? "even" : "odd";
                System.out.println(n + " is positive and " + parity + ".");
            } else if (n < 0) {
                System.out.println(n + " is negative.");
            } else {
                System.out.println(n + " is zero.");
            }
        }

        // Compare first and last elements
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        if (first == last) {
            System.out.println("First element (" + first + ") is equal to last element (" + last + ").");
        } else if (first > last) {
            System.out.println("First element (" + first + ") is greater than last element (" + last + ").");
        } else {
            System.out.println("First element (" + first + ") is less than last element (" + last + ").");
        }

        scanner.close();
    }
}
