import java.io.*;
public class UserInput2 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter int value:");
		int num=Integer.parseInt(br.readLine());
		System.out.println(num);
		System.out.println("Enter float value:");
		float num2=Float.parseFloat(br.readLine());
		System.out.println(num2);
		System.out.println("Enter String:");
		String st=br.readLine();
		System.out.println(st);
	}

}
