import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double l = s.nextDouble();
        double w = s.nextDouble();
        double p = 2 * (l + w);
        System.out.println(p);
        s.close();
    }
}
