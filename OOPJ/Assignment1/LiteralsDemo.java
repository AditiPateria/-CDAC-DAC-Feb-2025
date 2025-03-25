class LiteralsDemo {
    public static void main(String[] args) {
        int binary = 0b1010;
        int octal = 012;
        int hexadecimal = 0xA;
        float floatLiteral = 12.34f;
        double doubleLiteral = 123.456;

        System.out.println("Binary Literal (0b1010): " + binary);
        System.out.println("Octal Literal (012): " + octal);
        System.out.println("Hexadecimal Literal (0xA): " + hexadecimal);
        System.out.println("Float Literal: " + floatLiteral);
        System.out.println("Double Literal: " + doubleLiteral);
    }
}


/* Output -  
Binary Literal (0b1010): 10
Octal Literal (012): 10
Hexadecimal Literal (0xA): 10
Float Literal: 12.34
Double Literal: 123.456 */