/*

Q4. Complex Number Operations
Create a class to represent complex numbers. Include the following constructors:
1. A default constructor that sets both real and imaginary parts to 0
2. A constructor that initializes the real part only
3. A constructor that initializes both real and imaginary parts
Also, write member functions to:
   Add two complex numbers
   Multiply two complex numbers
In the main() method:
   Create two complex numbers: 3 + 2i and 4 - 2i
   Display their sum and product



*/


import java.util.* ;

class Complex {
    private double real, imag;

    // Constructor with default values
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Method to add two complex numbers
    public Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    // Method to multiply two complex numbers
    public Complex multiply(Complex c) {
        return new Complex(this.real * c.real - this.imag * c.imag, this.real * c.imag + this.imag * c.real);
    }

    // Method to display the complex number
    public void display() {
        System.out.println(real + (imag >= 0 ? " + " : " - ") + Math.abs(imag) + "i");
    }
}

public class ComplexNumberDemo {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(4, -2);
        
        Complex sum = c1.add(c2);
        Complex product = c1.multiply(c2);
        
        System.out.print("Sum: ");
        sum.display();
        
        System.out.print("Product: ");
        product.display();
    }
}




//O/P: Sum: 7.0 + 0.0i
// Product: 16.0 + 2.0i
