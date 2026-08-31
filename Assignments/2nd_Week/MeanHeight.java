import java.util.Scanner;

/**
 * MeanHeight.java
 * Reads heights of 11 players (double) and computes the mean height.
 */
public class MeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TEAM_SIZE = 11;
        double[] heights = new double[TEAM_SIZE];

        System.out.println("Enter heights (in meters or preferred unit) of " + TEAM_SIZE + " players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            if (!scanner.hasNextDouble()) {
                System.err.println("Invalid input. Expected a numeric height. Exiting.");
                scanner.close();
                return;
            }
            double h = scanner.nextDouble();
            if (h <= 0.0) {
                System.err.println("Invalid height (must be positive). Exiting.");
                scanner.close();
                return;
            }
            heights[i] = h;
        }

        double sum = 0.0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        double mean = sum / heights.length; // mean formula
        System.out.println("Mean height of the football team: " + mean);

        scanner.close();
    }
}
