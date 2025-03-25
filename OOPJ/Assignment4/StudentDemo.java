/* 

 Q2. Student Marks and Average
Create a class Student with the following members:
 Name of the student
 Marks in three subjects
 A method to assign initial values
 A method to compute the total and average marks
 A method to display the student’s name and total marks
Write a main() method to demonstrate the functionality of the class.

*/



import java.util.* ;

class Student
{

 	String name  ;
	float m1 , m2 ,  m3  ;
	float total = 0 ;
	float  avg = 0 ;
	
	Student(String name ,  float m1 , float m2, float m3 )
	{
		this.name = name; 
		this.m1 = m1 ;
        this.m2 = m2 ;
        this.m3 = m3 ;		
		
		
	}

    void  TotalAndAvg()
	{
        total  = m1 + m2 + m3 ; 
		
	  avg = total / 3 ;
		 
	}		
	
	void display()
	{
	   System.out.println("Student Name : " + name );
	   System.out.println("total mark   : " +  total);
	   System.out.println("Average mark : " + avg );
	}

}

class   StudentDemo 
{

	public static void main(String Args[])
	{
		Scanner sc  =  new Scanner(System.in);
		
		System.out.println("Enter the name of student : ");
		String s = sc.next() ;
		System.out.println("Enter marks of first subject :  ");
		float n1 = sc.nextFloat() ;
		System.out.println("Enter marks of second subject : ");
		float n2 = sc.nextFloat() ;
		System.out.println("Enter marks of third subject : ");
		float n3 = sc.nextFloat() ;
		
		Student s1 = new Student(s,n1,n2,n3 );
		s1.TotalAndAvg() ;
		s1.display();
		 
		
	}
	

}





*/O/P: Enter the name of student :
Aditi
Enter marks of first subject :
60
Enter marks of second subject :
70
Enter marks of third subject :
80
Student Name : Aditi
total mark   : 210.0
Average mark : 70.0*/