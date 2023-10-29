import java.io.*;

public class ArmstrongNo
{
	public static void main(String args[])
	{
		int num=370,sum=0;
		int temp=num;
		while(num!=0)
		{
			int n=num%10;
			sum=sum+(int)Math.pow(n,3);
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("Armstrong No");
		}
		else
			System.out.println("Not Armstrong");
		
	}
	

}
