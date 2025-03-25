class BooleanLiteralsDemo {
    public static void main(String[] args) {
        boolean flag = true;

        if (flag) {
            System.out.println("Flag is true. Execution in if block.");
        } else {
            System.out.println("Flag is false. Execution in else block.");
        }

        flag = false;

        if (flag) {
            System.out.println("Flag is true. Execution in if block.");
        } else {
            System.out.println("Flag is false. Execution in else block.");
        }
    }
}

/* Output - 
Flag is true. Execution in if block.
Flag is false. Execution in else block. */
