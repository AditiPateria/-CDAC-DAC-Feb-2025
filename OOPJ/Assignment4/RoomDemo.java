/* 

 Q1. Room Volume Calculation
Design a class named Room with three data members: height, width, and breadth. Include a method
volume() to compute and return the volume of the room. Create a separate class RoomDemo that
creates instances of the Room class and displays the volume for each instance.

*/



import java.util.* ;

class Room
{

 	float h  , w , l ;
	
	Room(float h,float  w ,float l )
	{
		this.h = h; 
		this.w = w ; 
		this.l = l ; 
		
	}

    float volume( )
	{
        float res = l * w * h ;
		 return  res ; 
	}		

}

class   RoomDemo 
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
		
		Room r1 = new Room(h, w , l );
		System.out.println("Volume of the room is : "+r1.volume());
		 
		
	}
	

}

 /*O/P :Enter the height of room :
30
Enter the width of room :
30
Enter the length of room :
30
Volume of the room is : 27000.0*/