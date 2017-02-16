import java.util.Scanner;

public class bullets {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
		String n=s.next();
		int max=0,c = 0;
		for(int i=0;i<n.length()-1;i++)
		{
			c=0;
			while(n.charAt(i)==n.charAt(i+1)&&n.charAt(i)=='1')
			{
				c++;
				i++;
				if(i==n.length()-1)
					break;
			}
			if(c>max)
				max=c;
		}
		if(c==0&&n.charAt(n.length()-1)=='1')
		System.out.println("1");
		else if(c==0&&n.charAt(n.length()-1)=='0')
			System.out.println("0");
		else
			System.out.println(max+1);
		}
	}

}
