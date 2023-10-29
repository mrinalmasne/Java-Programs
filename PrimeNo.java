import java.io.*;
import java.util.*;
public class PrimeNo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int temp=0,i=0;
		System.out.println("Enter no:");
		int n=sc.nextInt();
		for(i=2;i<=(n/2);i++)
		{
			if(n%i==0)
			{
				temp=1;
				break;
			}
		}
			if(temp==1)
				System.out.println("Not Prime");
			else
				System.out.println("Prime");
		}
	}
	
