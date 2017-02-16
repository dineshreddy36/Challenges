import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Common {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		ArrayList<Integer> res=new ArrayList<Integer>();
		
		while(t-->0)
		{
		int n=s.nextInt();
		int m=s.nextInt();
		int[] A=new int[n];
		for(int i=0;i<n;i++)
			A[i]=s.nextInt();
		TreeMap<Integer, Integer> tmap = 
	             new TreeMap<Integer, Integer>();
		int c=0;
		for(int i=0;i<m;i++)
		{
			tmap.put(s.nextInt(), 1);
		}
		for(int i=0;i<n;i++)
		{
			if(tmap.get(A[i])!=null)
				c++;
		}
		System.out.println(c);
		
		}
	}

}
