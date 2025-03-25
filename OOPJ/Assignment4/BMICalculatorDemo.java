/*

Q5. BMI Calculator
Design a Java program to implement a BMI (Body Mass Index) calculator. The program should
consist of a class named BMICalculator with the following specifications:


Class: BMICalculator
Fields
 height (double): To store the height of the person in meters.
 weight (double): To store the weight of the person in kilograms.
Constructors
 A parameterized constructor to initialize the height and weight fields.
Methods
 Getter and Setter methods for both height and weight.
 double calculateBMI(): This method calculates and returns the BMI using the formula:
BMI=weight(height×height)\text{BMI} = \frac{\text{weight}}{(\text{height} \times
\text{height})}BMI=(height×height)weight
Main Program : Write a separate class containing the main() method to
1. Create an object of the BMICalculator class.
2. Prompt the user to enter their height and weight.
3. Use setter methods to assign these values to the object.
4. Call the calculateBMI() method to compute the BMI.
5. Print the calculated BMI to the console


*/




import java.util.* ; 


class BMICalculator
{
  private double h , w  ; 
   
   BMICalculator(double h , double w)
   {
	   this.h = h ; 
	   this.w= w  ;
	   
   }
   
   public void seth(double h )
   {
	   this.h = h ;
   }
   
    public void setw(double w )
   {
	   this.w = w ;
   }
   
    public double geth(double h )
   {
	   return h ;
   }
   
    public double getw(double w )
   {
	   return w ;
   }
   
   double calculateBMI()
   {
	  return  ( w / (h * h ) )   ;
   }


}

class BMICalculatorDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in) ; 
		
      
	  System.out.println("Enter the height (Meters only): ");
	  double h = sc.nextDouble();
	  System.out.println("Enter the Weight (KiloGrams only): ");
	  double w = sc.nextDouble();
	  
	  BMICalculator b1 = new BMICalculator(h , w) ;
	  
	  
	   System.out.println("BMI Index : "+b1.calculateBMI());

	}
}