import java.util.Scanner;
import java.util.Arrays;

/**
 * FactorsArray.java
 * Finds factors of a user-entered positive integer, stores them in a dynamically resized int[] and prints them.
 */
public class FactorsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer to find its factors: ");
        if (!scanner.hasNextInt()) {
            System.err.println("Invalid input. Expected an integer. Exiting.");
            scanner.close();
            return;
        }
        int number = scanner.nextInt();
        if (number <= 0) {
            System.err.println("Invalid input. Number must be positive. Exiting.");
            scanner.close();
            return;
        }

        int maxFactorCapacity = 10;
        int[] factors = new int[maxFactorCapacity];
        int factorCount = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Ensure capacity
                if (factorCount >= factors.length) {
                    maxFactorCapacity *= 2;
                    factors = Arrays.copyOf(factors, maxFactorCapacity);
                }
                factors[factorCount++] = i;
            }
        }

        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < factorCount; i++) {
            System.out.print(factors[i] + (i < factorCount - 1 ? ", " : "\n"));
        }

        scanner.close();
    }
}
