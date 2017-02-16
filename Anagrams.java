/* package whatever; // don't place package name! */

import java.util.*;


 class Anagrams
{
	public static void main (String[] args) throws java.lang.Exception
	{
	TreeMap<String, Integer> tmap = 
             new TreeMap<String, Integer>();
	Scanner sc=new Scanner(System.in);
 String s=sc.next();
String r=sc.next();
CharSequence c= s.substring(0);
CharSequence cww= "LRRR";

LinkedList<Integer> ll =new LinkedList<Integer>();
double d=Double.parseDouble(s);
int flag=0;

for(int i=0;i<s.length();i++)
{
	String n=s.substring(i,i+1);
	if(tmap.get(n)!=null)
	tmap.put(n,tmap.get(n)+1);
	else
	tmap.put(n,1);
}
int count=0;
// System.out.println(tmap.get("a"));
for(int i=0;i<r.length();i++)
{
String n=r.substring(i,i+1);
//System.out.print(n);
        if(tmap.get(n)==null)
        {
        	
        }
        else if(tmap.get(n)==1)
		{
		tmap.remove(n);
		count++;
		}
		else 
		{
		tmap.put(n,tmap.get(n)-1);
		count++;
		}
	}
Stack sin = new Stack<Character>();
char ass=(char) sin.pop();


String mentry = tmap.lastKey();


sin.push(1);
 System.out.println(s.length()+r.length()-2*count);
//      Set set = tmap.entrySet();
//      Iterator iterator = set.iterator();
//      while(iterator.hasNext()) {
//         Map.Entry mentry = (Map.Entry)iterator.next();
//         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
//         System.out.println(mentry.getValue());
//      } 
}
}