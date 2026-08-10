import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double km = s.nextDouble();
        double miles = km * 0.621371;
        System.out.println(miles);
        s.close();
    }
}
