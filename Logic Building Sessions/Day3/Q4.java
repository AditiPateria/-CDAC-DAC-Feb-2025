public class Q4 {
    public static void main(String[] args) {
        int num = 1234;
        int revNum = 0;

        while (num != 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed number: " + revNum);
    }
}
// Reversed number: 4321
