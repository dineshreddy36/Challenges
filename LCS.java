import java.util.Scanner;

public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int c=s.nextInt();
			int d=s.nextInt();
			int l=s.nextInt();
			int count=0;
			if(l%4!=0)
				System.out.println("no");
			else
			{
				if(4*d>l)
					System.out.println("no");
				else
				{
					count=l-4*d;
					count=count/4;
					if(c<=2*d&&count<=c)
						System.out.println("yes");
					else if(c>2*d&&count>=c-2*d)
						System.out.println("yes");
					else
						System.out.println("no");
					
				}
					
				
				
			}
			
			
		}
		
		
	}

}
