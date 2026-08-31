import java.util.Scanner;

/**
 * Table6to9.java
 * Computes multiplication results of a number with multipliers from 6 to 9 and prints them.
 */
public class Table6to9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (!scanner.hasNextInt()) {
            System.err.println("Invalid input. Expected an integer. Exiting.");
            scanner.close();
            return;
        }
        int number = scanner.nextInt();
        final int START = 6;
        final int END = 9;
        final int SIZE = END - START + 1; // 4 entries
        int[] multiplicationResults = new int[SIZE];

        for (int i = 0; i < multiplicationResults.length; i++) {
            int multiplier = START + i;
            multiplicationResults[i] = number * multiplier;
        }

        System.out.println("Multiplication results for " + number + " from " + START + " to " + END + ":");
        for (int i = 0; i < multiplicationResults.length; i++) {
            System.out.println(number + " * " + (START + i) + " = " + multiplicationResults[i]);
        }

        scanner.close();
    }
}
