import java.util.Scanner;

/**
 * TwoDTo1D.java
 * Reads a rows x columns 2D matrix from user input, copies elements into a 1D array and prints both.
 */
public class TwoDTo1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows (positive integer): ");
        if (!scanner.hasNextInt()) {
            System.err.println("Invalid input. Expected integer. Exiting.");
            scanner.close();
            return;
        }
        int rows = scanner.nextInt();
        if (rows <= 0) {
            System.err.println("Rows must be positive. Exiting.");
            scanner.close();
            return;
        }

        System.out.print("Enter number of columns (positive integer): ");
        if (!scanner.hasNextInt()) {
            System.err.println("Invalid input. Expected integer. Exiting.");
            scanner.close();
            return;
        }
        int cols = scanner.nextInt();
        if (cols <= 0) {
            System.err.println("Columns must be positive. Exiting.");
            scanner.close();
            return;
        }

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements (" + rows + " x " + cols + ") row by row:");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print("Element [" + r + "][" + c + "]: ");
                if (!scanner.hasNextInt()) {
                    System.err.println("Invalid input. Expected integer. Exiting.");
                    scanner.close();
                    return;
                }
                matrix[r][c] = scanner.nextInt();
            }
        }

        // Copy to 1D array
        int[] flattened = new int[rows * cols];
        int index = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                flattened[index++] = matrix[r][c];
            }
        }

        System.out.println("Matrix:");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }

        System.out.println("Flattened 1D array (row-major):");
        for (int i = 0; i < flattened.length; i++) {
            System.out.print(flattened[i] + (i < flattened.length - 1 ? ", " : "\n"));
        }

        scanner.close();
    }
}
