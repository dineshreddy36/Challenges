/* package whatever; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	TreeMap<String, Integer> tmap = 
             new TreeMap<String, Integer>();
	
 String s="din  e  shdd";
s=s.replace(" ", "");
String r="hse ni d";
r=r.replace(" ", "");
int flag=0;
if(s.length()!=r.length())
flag=1;
else
{
for(int i=0;i<s.length();i++)
{
	String n=s.substring(i,i+1);
	if(tmap.get(n)!=null)
	tmap.put(n,tmap.get(n)+1);
	else
	tmap.put(n,1);
}
// System.out.println(tmap.get("a"));
for(int i=0;i<r.length();i++)
{
String n=r.substring(i,i+1);
//System.out.print(n);
	if(tmap.get(n)==null)
	{
	flag=1;
	break;
	}
	else
	{
		if(tmap.get(n)==1)
		tmap.remove(n);
		else
		tmap.put(n,tmap.get(n)-1);
	}
	}

 System.out.println(flag);
//      Set set = tmap.entrySet();
//      Iterator iterator = set.iterator();
//      while(iterator.hasNext()) {
//         Map.Entry mentry = (Map.Entry)iterator.next();
//         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
//         System.out.println(mentry.getValue());
//      } 
	}
}
}