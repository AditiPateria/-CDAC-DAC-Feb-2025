class LogicalOperators {
    public static void main(String[] args) {
        int num = 24;
        if (num > 0 && num % 2 == 0) {
            System.out.println(num + " is positive and even.");
        } else if (num > 0 || num % 2 == 0) {
            System.out.println(num + " is either positive or even.");
        } else {
            System.out.println(num + " is neither positive nor even.");
        }
        if (!(num < 0)) {
            System.out.println(num + " is not negative.");
        }
    }
}


/* Output - 
24 is positive and even.
24 is not negative. */