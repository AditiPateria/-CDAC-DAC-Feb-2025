public class Q9 {
    public static void main(String[] args) {
        int num = 4825;
        int largest = 0;

        while (num != 0) {
            int a = num % 10;
            if (a > largest) {
                largest = a;
            }
            num /= 10;
        }

        System.out.println("Largest digit: " + largest);
    }
}
// Largest digit: 8