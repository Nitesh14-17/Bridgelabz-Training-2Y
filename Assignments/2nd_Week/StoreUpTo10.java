import java.util.Scanner;

/**
 * StoreUpTo10.java
 * Stores up to 10 positive numbers entered by the user; stops on 0 or negative input.
 * Prints all stored numbers and their sum.
 */
public class StoreUpTo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_SIZE = 10;
        double[] values = new double[MAX_SIZE];
        int index = 0;

        System.out.println("Enter positive numbers (enter 0 or a negative number to stop). Up to " + MAX_SIZE + " values.");
        while (true) {
            if (index >= values.length) {
                System.out.println("Reached maximum storage capacity of " + MAX_SIZE + ".");
                break;
            }
            System.out.print("Enter number " + (index + 1) + ": ");
            if (!scanner.hasNextDouble()) {
                System.err.println("Invalid input. Expected a number. Exiting.");
                scanner.close();
                return;
            }
            double entry = scanner.nextDouble();
            if (entry <= 0.0) { // 0 or negative stops
                break;
            }
            values[index] = entry;
            index++;
        }

        // Display stored values and compute sum
        double total = 0.0;
        System.out.println("Stored values:");
        for (int i = 0; i < index; i++) {
            System.out.println("Value " + (i + 1) + ": " + values[i]);
            total += values[i];
        }
        System.out.println("Sum of stored values: " + total);

        scanner.close();
    }
}
