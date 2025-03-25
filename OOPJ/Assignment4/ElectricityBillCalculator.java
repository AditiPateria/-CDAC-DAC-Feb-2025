/*


Q6. Electricity Bill Calculation – Java Program
Design a Java program to calculate the electricity bill for a customer based on the number of units
consumed. Implement a class named ElectricityBill with the following specifications:
Class: ElectricityBill
Instance Variables
 customerName (String): Name of the customer
 unitsConsumed (double): Number of electricity units consumed
 billAmount (double): The calculated bill amount
Constructor
 A parameterized constructor to initialize the customerName and unitsConsumed fields.
Method
 void calculateBillAmount(): This method calculates the electricity bill amount based on the
following tariff rules:
 First 100 units: Rs. 5 per unit○ Next 200 units (i.e., 101 to 300): Rs. 7 per unit
 Remaining units (above 300): Rs. 10 per unit
Main Program
In the main() method:
CDAC Mumbai
1. Create an object of the ElectricityBill class.
2. Set the customerName and unitsConsumed values (can be taken from user input or
hardcoded).
3. Call the calculateBillAmount() method to compute the bill.
4. Display the customer's name, units consumed, and final bill amount.


*/
import java.util.Scanner;

class ElectricityBill {
    // Instance variables
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

    // Constructor
    public ElectricityBill(String customerName, double unitsConsumed) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
        this.billAmount = 0.0;
    }

    // Method to calculate bill amount
    public void calculateBillAmount() {
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5;
        } else if (unitsConsumed <= 300) {
            billAmount = (100 * 5) + ((unitsConsumed - 100) * 7);
        } else {
            billAmount = (100 * 5) + (200 * 7) + ((unitsConsumed - 300) * 10);
        }
    }

    // Method to display bill details
    public void displayBill() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill Amount: Rs. " + billAmount);
    }
}

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Units Consumed: ");
        double units = scanner.nextDouble();
        
        // Creating an object of ElectricityBill class
        ElectricityBill bill = new ElectricityBill(name, units);
        
        // Calculating the bill
        bill.calculateBillAmount();
        
        // Displaying the bill details
        bill.displayBill();
        
        scanner.close();
    }
}



 /* O/P : Enter Customer Name: Aditi
Enter Units Consumed: 200
Customer Name: Aditi
Units Consumed: 200.0
Total Bill Amount: Rs. 1200.0*/

































