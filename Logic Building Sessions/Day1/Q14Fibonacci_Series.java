class Q14Fibonacci_Series{
  public static void main(String[] args){
        int n = 10;
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci Series (" + n + " terms):");

        for (int i = 1; i <= n; i++) {

            System.out.print(a + " ");

            int c = a + b;

            a = b;
            b = c;
}
}
}