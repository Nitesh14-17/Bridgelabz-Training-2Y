import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double r = s.nextDouble();
        double h = s.nextDouble();
        double volume = Math.PI * r * r * h;
        System.out.println(volume);
        s.close();
    }
}
