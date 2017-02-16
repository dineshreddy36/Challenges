import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class points {

	
	static int closest(int k, int[] len)
	{
		int val=0;
		if(k<len[0])
		{
			return len[0];
		}
		for(int i=0;i<len.length-1;i++)
		{
			if(len[i]<k&&len[i+1]>k)
				return len[i+1];
		}
		return val;
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
		int n=s.nextInt();
		int[] x=new int[n];
		int[] y=new int[n];
		for(int i=0;i<n;i++)
		{
			x[i]=s.nextInt();
			y[i]=s.nextInt();
		}
		int m=s.nextInt();
		TreeMap<Integer, Integer> tmap = 
	             new TreeMap<Integer, Integer>();
		int[] len=new int[m];
		for(int i=0;i<m;i++)
		{
			len[i]=s.nextInt();
			tmap.put(len[i],s.nextInt());
		}
		Arrays.sort(len);
		int cost=0;
		double length=0;
		if(n<=1)
			System.out.println("0");
			else
			{
		int total=0;
		for(int i=0;i<n;i++)
		{
			
			if(i==n-1)
			{
				length=Math.sqrt(Math.pow(x[i]-x[0],2)+Math.pow(y[i]-y[0],2));
				if(tmap.get((int)length)!=null)
				total+=tmap.get((int)length);
				else
					total+=tmap.get(closest((int)length, len));
			}
			else
			{
			length=Math.sqrt(Math.pow(x[i]-x[i+1],2)+Math.pow(y[i]-y[i+1],2));
			if(tmap.get((int)length)!=null)
			total+=tmap.get((int)length);
			else
				total+=tmap.get(closest((int)length, len));
			}
			

			

			
		}
		System.out.println(total);
			}
		
		
		}
	}

}
