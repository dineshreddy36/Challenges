import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			long n=s.nextLong();
			int c=1;
			long sum=n+1;
			for(long i=2;i<=Math.sqrt(n);i++)
			{
				for(long j=(int)n/2;j>=2;j--)
				{
					if(Math.pow(i, j)==n)
					{
						c++;
						sum=sum+i+j;
						break;
					}
				}
			}
			System.out.println(c);
			System.out.println(sum);
		}
	}

}
