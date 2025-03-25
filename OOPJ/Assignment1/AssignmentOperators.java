class AssignmentOperators {
    public static void main(String[] args) {
        int num1 = 20, num2 = 10;

        num1 = num2;
        System.out.println("= Operator: " + num1);

        num1 += num2;
        System.out.println("+= Operator: " + num1);

        num1 -= num2;
        System.out.println("-= Operator: " + num1);

        num1 *= num2;
        System.out.println("*= Operator: " + num1);

        num1 /= num2;
        System.out.println("/= Operator: " + num1);

        num1 %= num2;
        System.out.println("%= Operator: " + num1);
    }
}


/* Output -
= Operator: 10
+= Operator: 20
-= Operator: 10
*= Operator: 100
/= Operator: 10
%= Operator: 0  */
