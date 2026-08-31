import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double base = s.nextDouble();
        double exp = s.nextDouble();
        double result = Math.pow(base, exp);
        System.out.println(result);
        s.close();
    }
}
