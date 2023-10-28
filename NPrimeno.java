
public class NPrimeno {

	public static void main(String[] args) {

        int count = 0, max_count = 10, i;
        System.out.println("First "+max_count+" Prime Numbers:");

        for(int num=1; count<max_count; num++)
        {
            for(i=2; num%i != 0; i++);

            if(i == num)
            {
                System.out.print(" "+num);
                count++;
            }
        }
		/*int n=10, cnt=0;
		for(int i=1;cnt<=n;i++)
		{
			for(int x=2;i%x==0;x++)
				if(x==i)
				{
					System.out.println(i);
					cnt++;
				}
		}*/

	}

}
