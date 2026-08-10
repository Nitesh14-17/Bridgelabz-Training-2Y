import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double r = s.nextDouble();
        double area = Math.PI * r * r;
        System.out.println(area);
        s.close();
    }
}
