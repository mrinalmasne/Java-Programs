
public class gcd {
	static int Gcd(int x,int y)
	{ 
		if(y==0)
			return x;
		return Gcd(y,x%y);
		
	}

	public static void main(String[] args) {
		int x=100,y=20;
		System.out.println(Gcd(x,y));

	}

}
