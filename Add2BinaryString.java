
public class Add2BinaryString {

	public static void main(String[] args)
	{
		String x="11011";
		String y="0110";
		int n1=Integer.parseInt(x,2);
		int n2=Integer.parseInt(y,2);
		int sum=n1+n2;
		String res=Integer.toBinaryString(sum);
		System.out.println(res);

	}

}
