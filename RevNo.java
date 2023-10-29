import java.io.*;
import java.util.*;
public class RevNo {
	public static void main(String args[])
	{
		int rev=0;
		System.out.println("Enter no:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
		System.out.println("Rev="+rev);
		
	}

}
