import java.util.*;
public class SumOfDigit {

	public static void main(String[] args) {
		int sum=0,rem=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter digit:");
		int n=sc.nextInt();
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		
		}
		System.out.println(sum);
		

	}

}
