import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double p = s.nextDouble();
        double r = s.nextDouble();
        double t = s.nextDouble();
        double si = (p * r * t) / 100;
        System.out.println(si);
        s.close();
    }
}
