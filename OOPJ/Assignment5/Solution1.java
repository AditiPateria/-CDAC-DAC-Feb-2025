import java.util.* ; 

class ElectricityBill
{
    String name  ;
    double units  ;
	double bill ; 
	
	ElectricityBill(String name ,  double units)
	{
	   this.name =  name  ;
	   this.units = units  ;
	
	}
	
	void calculateBillAmount()
	{
	   if(units<=100)
	   {
	       bill = units*5 ; 
		   
	   }else if(units <= 300)
	   {
	      bill = 100*5 + (units-100)* 7 ; 
	   
	   }
	   else 
	   {
	      bill =  units*10 ;
	   
	   }
	    System.out.println("Customer Name : "+name +"\n"+"Units Consumed : "+units+"\n"+"Total Bill Amount : "+bill);
	
	}

}

class Solution1
{
   public static void main(String []Args )
   {
	   Scanner sc = new Scanner(System.in);
      try
	  {
		System.out.println("Enter customer name : ");
	    String name  = sc.next();
		System.out.println("Enter units consumed : ");
		double units = sc.nextDouble() ;
		
		if(units < 0 )
		{
			throw new IllegalArgumentException("IllegalArgumentException : no negative values for units");
		}
		
		
		ElectricityBill e1 = new ElectricityBill(name , units );
		
	 	  e1.calculateBillAmount();
		  
	  }catch(InputMismatchException e )
	  {
		  System.out.println(e);
	  }
	  catch(IllegalArgumentException e)
	  {
		  System.out.println(e.getMessage());  
	  }
   
   }

}




/*O/P: Enter customer name :
Aditi
Enter units consumed :
200
Customer Name : Aditi
Units Consumed : 200.0
Total Bill Amount : 1200.0*/
