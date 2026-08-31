import java.util.Scanner;

/**
 * FizzBuzzArray.java
 * FizzBuzz from 0..N (inclusive). Stores results in a String array and prints positions.
 */
public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer N for FizzBuzz (N >= 0): ");
        if (!scanner.hasNextInt()) {
            System.err.println("Invalid input. Expected integer. Exiting.");
            scanner.close();
            return;
        }
        int N = scanner.nextInt();
        if (N < 0) {
            System.err.println("Invalid input. N must be >= 0. Exiting.");
            scanner.close();
            return;
        }

        String[] results = new String[N + 1]; // positions 0..N
        for (int i = 0; i < results.length; i++) {
            boolean multipleOf3 = (i % 3 == 0);
            boolean multipleOf5 = (i % 5 == 0);
            if (multipleOf3 && multipleOf5) {
                results[i] = "FizzBuzz";
            } else if (multipleOf3) {
                results[i] = "Fizz";
            } else if (multipleOf5) {
                results[i] = "Buzz";
            } else {
                results[i] = Integer.toString(i);
            }
        }

        // Print results in required format Position i = X
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        scanner.close();
    }
}
