import java.util.Scanner;

public class Reservoir {

	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	int t=s.nextInt();
	while(t-->0)
	{
		int n=s.nextInt();
		int m=s.nextInt();
		int flag=0;
		String[] data=new String[n];
		for(int i=0;i<n;i++)
		data[i]=s.next();
		Math.abs(-1);
		
		// checking for bottom row
		for(int i=0;i<m;i++)
		{
			if(data[n-1].charAt(i)!='B')
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("no");
		else
			System.out.println("yes");
		
//		for(int i=0;i<m;i++)
//		{
//			if(!data[0][i].equals("B")||!data[n-1][i].equals("B"))
//			{
//				flag=1;
//				break;
//			}
//		}
//		if(flag==1)
//			System.out.println("no");
//		else
//			System.out.println("yes");
//			
		
		
		
		
	}
	
		
		
	}

}



//
//static int area(int x1, int y1, int x2, int y2, int x3, int y3)
//{
//   return Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2)));
//}
//
//
//
//    static int pointsBelongToTriangle(int x1, int y1, int x2, int y2, int x3, int y3, int p1, int q1, int p2, int q2) {
//
//        double a=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
//        double b=Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
//        double c=Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
//        
//        System.out.print(a+b+c);
//        
//        if((a+b>c||b+c>a||c+a>b))
//            {
//            int A=area(x1,y1,x2,y2,x3,y3);
//            int A1=area(p1,q1,x2,y2,x3,y3);
//            int A2=area(x1,y1,p1,q1,x3,y3);
//            int A3=area(x1,y1,x2,y2,p1,q1);
//            
//            int B=area(x1,y1,x2,y2,x3,y3);
//            int B1=area(p2,q2,x2,y2,x3,y3);
//            int B2=area(x1,y1,p2,q2,x3,y3);
//            int B3=area(x1,y1,x2,y2,p2,q2);
//            
//            if(A==A1+A2+A3||B==B1+B2+B3)
//             {
//            if(A==A1+A2+A3&&B==B1+B2+B3)
//              return 3;
//                else if(A==A1+A2+A3)
//                    return 1;
//                    else 
//                    return 2;
//                
//                
//             }
//            else
//            return 4;
//            
//            
//            
//            
//            
//        }
//        else
//            return 0;
//        
//        
//
//    }
//







