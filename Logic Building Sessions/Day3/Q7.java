public class Q7 {
    public static void main(String[] args) {
        int num = 9876;
        int a = 0;

        while (num != 0) {
            int digit = num % 10;
            a += digit;
            num /= 10;
        }

        System.out.println("Sum of digits: " + a);
    }
}
// Sample Output: Sum of digits: 30
