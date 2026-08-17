public class ReverseDigits {
    public static int reverse(int n) {
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        System.out.println("Reverse of 1234: " + reverse(1234));
        System.out.println("Reverse of 806: " + reverse(806));
    }
}
