import java.util.Scanner;

/**
 * MultiplicationTable.java
 * Builds a multiplication table for a given number (1..10) into an array and prints it.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to build its multiplication table: ");
        if (!scanner.hasNextInt()) {
            System.err.println("Invalid input. Expected an integer. Exiting.");
            scanner.close();
            return;
        }
        int number = scanner.nextInt();
        final int TABLE_SIZE = 10;
        int[] table = new int[TABLE_SIZE];

        for (int i = 0; i < table.length; i++) { // use length property
            int multiplier = i + 1; // 1..10
            table[i] = number * multiplier;
        }

        System.out.println("Multiplication table for " + number + ":");
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        scanner.close();
    }
}
