import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double c = s.nextDouble();
        double f = (c * 9 / 5) + 32;
        System.out.println(f);
        s.close();
    }
}
