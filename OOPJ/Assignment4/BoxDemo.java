/* 

 Q3. Box Area and Volume
Write a class Box with three member variables: height, width, and breadth. Include appropriate
constructors to initialize these variables. Also, implement two methods:
 getVolume() to return the volume of the box
 getArea() to return the surface area of the box
Create two instances of the Box class and display their volumes and surface areas.
*/




import java.util.* ;

class Box
{

 	float h  , w , l ;
	
	Box(float h,float  w ,float l )
	{
		this.h = h; 
		this.w = w ; 
		this.l = l ; 
		
	}

    float getVolume( )
	{
        float res = l * w * h ;
		 return  res ; 
	}
 
    float getArea()
	{
	  float area = l * w  ; 
        return area ; 
		
	}
	

}

class   BoxDemo 
{

	public static void main(String Args[])
	{
		Scanner sc  =  new Scanner(System.in);
		
		System.out.println("Enter the height of room : ");
		float h = sc.nextFloat() ;
		System.out.println("Enter the width of room : ");
		float w = sc.nextFloat() ;
		System.out.println("Enter the length of room : ");
		float l = sc.nextFloat() ;
		
		Box b1 = new Box(h, w , l );
		System.out.println("Volume of the room is : "+b1.getVolume());
		System.out.println("Area of the room is : "+b1.getArea());
		 
		
	}
	

}



/*O/P: Enter the height of room :
30
Enter the width of room :
20
Enter the length of room :
20
Volume of the room is : 12000.0
Area of the room is : 400.0  */