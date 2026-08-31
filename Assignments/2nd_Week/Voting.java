import java.util.Scanner;

/**
 * Voting.java
 * Reads ages of 10 students and reports whether each student can vote.
 */
public class Voting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TOTAL_STUDENTS = 10; // all values as variables
        int[] ages = new int[TOTAL_STUDENTS];

        System.out.println("Enter ages of " + TOTAL_STUDENTS + " students (integers):");
        for (int i = 0; i < ages.length; i++) { // use length property
            System.out.print("Student " + (i + 1) + " age: ");
            if (!scanner.hasNextInt()) {
                System.err.println("Invalid input. Expected an integer age. Exiting.");
                scanner.close();
                return;
            }
            ages[i] = scanner.nextInt();
            if (ages[i] < 0) {
                System.err.println("Invalid age (negative). Exiting.");
                scanner.close();
                return;
            }
        }

        // Check voting eligibility
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }

        scanner.close();
    }
}
