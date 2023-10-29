import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		int res=0,i,temp=0,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no;");
		int n=sc.nextInt();
		temp=n;
		
		while(n!=0)
		{
			rev=n%10;
			res=res*10+rev;
			n=n/10;
		}
		if(temp==res)
			System.out.println("Palindrome");
		else
			System.out.println("Not  Palindrome");
		

	}

}
