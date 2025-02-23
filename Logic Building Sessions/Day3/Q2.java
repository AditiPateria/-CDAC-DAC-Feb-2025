public class Q2 {
    public static void main(String[] args) {
        long factorial = 1;
        for (int i = 1; i <= 10; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of 10: " + factorial);
    }
}
// Factorial of 10: 3628800