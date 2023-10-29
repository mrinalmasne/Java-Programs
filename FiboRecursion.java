import java.util.*;
public class FiboRecursion {
	  static int  fibo(int i)
	{
		if(i==0)
			return 0;
		else if(i==1)
			return 1;
		else
			return (fibo(i-1)+fibo(i-2));
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			System.out.print(fibo(i));
		}
		

	}

}
