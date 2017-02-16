import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class triathlon {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//long n=Long.parseLong(s.next());
		int n=5;
		long[] c = new long[n];
		int[] r = new int[n];
		int[] f = new int[n];
		for(int i=0;i<n;i++)
		{
			c[i]=Integer.parseInt(s.next());
			//r[i]=c[i]+Integer.parseInt(s.next())+Integer.parseInt(s.next());
//			System.out.println(c[i]+" "+r[i]);
		}
		TreeMap<Integer, Integer> tmap = 
	             new TreeMap<Integer, Integer>();

	    ArrayList<Integer> l=new ArrayList<Integer>();
	   
	      
	      /* Display content using Iterator*/
	      Set set = tmap.descendingKeySet();
	      Iterator iterator = set.iterator();
	      int counter=0,i=0;
	      	      while(iterator.hasNext()) {
	         int key = (int) iterator.next();
	         f[i++]=counter+tmap.get(key);
	         counter+=key;
//	         System.out.println(f[i-1]);
	      }
	      	     
		
	      	      Arrays.sort(f);
	      	    System.out.println(f[n-1]);
	}

}
