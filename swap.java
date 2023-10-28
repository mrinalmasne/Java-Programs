
public class swap {

	public static void main(String args[])
	{
		int a=10,b=12;
		int temp;
		System.out.println("Before swap");
		System.out.println("A="+ a +"B=" +b);
		
		/*temp=a;     //First logic
		a=b;
		b=temp;*/
		
	/*	a=a+b;      // Second logic
		b=a-b;
		a=a-b;*/
		
	/*	a=a^b;      //Third logic
		b=a^b;
		a=a^b;  */
		
		a=(a+b)-(b=a);      // Fourth logic (Using BODMAS Rule)
		
		System.out.println("After swap");
		System.out.println("A="+ a +"B=" +b);
		
		
	}
}
