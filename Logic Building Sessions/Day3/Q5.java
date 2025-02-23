public class Q5 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence up to 21: ");
        while (a <= 21) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }
}
// Fibonacci sequence up to 21: 0 1 1 2 3 5 8 13 21