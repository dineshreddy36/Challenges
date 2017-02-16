import java.io.*;
import java.util.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
public class LL {
    
    
public static <K, V extends Comparable<V>> Map<K, V> 
    sortByValues(final Map<K, V> map) {
    Comparator<K> valueComparator = 
             new Comparator<K>() {
      public int compare(K k1, K k2) {
        int compare = 
              map.get(k1).compareTo(map.get(k2));
        if (compare == 0) 
          return 1;
        else 
          return compare;
      }
    };
 
    Map<K, V> sortedByValues = 
      new TreeMap<K, V>(valueComparator);
    sortedByValues.putAll(map);
    return sortedByValues;
  }    
    
    
public static void main(String args[] ) throws Exception {
    Scanner s=new Scanner(System.in);
		int n=Integer.parseInt(s.next());
    long[][] id=new long[n][3];
//    long[] start=new long[n];
//    long[] end=new long[n];
    for(int i=0;i<n;i++)
        {
    	for(int j=0;j<3;j++)
    	{
    		id[i][j]=Long.parseLong(s.next());
    	}
//        id[i]=Long.parseLong(s.next());
//        start[i]=Long.parseLong(s.next());
//        end[i]=Long.parseLong(s.next());
    }
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            //only checking the 3rd column
            if(id[i][2]<id[j][2])
            {
            	long temp=id[i][2];
            	id[i][2]=id[j][2];
            	id[j][2]=temp;
            	 temp=id[i][1];
            	id[i][1]=id[j][1];
            	id[j][1]=temp;
            	 temp=id[i][0];
            	id[i][0]=id[j][0];
            	id[j][0]=temp;
            	
            	
            }
//                swap(points[i],points[j]);
        }
    }

    
    for(int i=0;i<n;i++)
    {
	for(int j=0;j<3;j++)
	{
		System.out.print(id[i][j]);
	}
	System.out.println();
    }
    
    
    
    
//    TreeMap<Long, Long> tmap = 
//	             new TreeMap<Long, Long>();
//    long count;
//    
//    
//    
//    
//    for(int i=0;i<n;i++)
//        {
//        count=0;
//        for(int j=0;j<n;j++)
//        {
//            
//                {
//           if(start[j]>start[i]&&end[j]<end[i])
//               count++;
//                }
//            
//        }
//        tmap.put(id[i],count);
//        //System.out.println(id[i]+ " "+count);
//        }
//    
//    
Stack<Integer> sta=new Stack<Integer>();


//    
//    Map sortedMap = sortByValues(tmap);
//    Set set = sortedMap.keySet();
//	      Iterator iterator = set.iterator();
//	      long counter=0,i=0;
//	      	      while(iterator.hasNext()) {
//	         long key = (long) iterator.next();
////	         System.out.println(key+ " "+tmap.get(key));
//	      }
//    
    
}
}

