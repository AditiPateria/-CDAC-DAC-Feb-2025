class LiteralsDemo1 {
    public static void main(String[] args) {
        char character = 'A';
        String stringLiteral = "Hello";

        System.out.println("Character Literal: " + character);
        System.out.println("ASCII Value of Character: " + (int) character);
        System.out.println("String Literal: " + stringLiteral);
        for (int i = 0; i < stringLiteral.length(); i++) {
            System.out.println("ASCII Value of " + stringLiteral.charAt(i) + ": " + (int) stringLiteral.charAt(i));
        }
    }
}

/* Output - 
Character Literal: A
ASCII Value of Character: 65
String Literal: Hello
ASCII Value of H: 72
ASCII Value of e: 101
ASCII Value of l: 108
ASCII Value of l: 108
ASCII Value of o: 111 */