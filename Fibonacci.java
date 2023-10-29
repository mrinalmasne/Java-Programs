import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		int i,res,first=0,second=1;
		int n=sc.nextInt();
		for( i=0;i<=n;i++)
		{
			if(i<=1)
			{
				res=i;
			}
			else
			{
				res=first+second;
				first=second;
				second=res;
			}
		
		System.out.print(res);
		}

	}

}
