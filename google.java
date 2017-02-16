import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class google {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int n;
		
        
        
        
			n = Integer.parseInt(br.readLine());
			String in=br.readLine();
		int len=in.length();
		int[] row=new int[len];
		int[] col=new int[len];
		for(int i=0;i<in.length();i++)
		{
		row[i]=(((int)in.charAt(i)-97)/n);
		col[i]=(((int)in.charAt(i)-97)%n);
		}
		
		for(int i=0;i<in.length()-1;i++)
		{
		if(row[i]-row[i+1]>0)
			System.out.print("up -"+ Math.abs(row[i]-row[i+1])+" ");
		else if(row[i]-row[i+1]<0)
			System.out.print("down -"+ Math.abs(row[i]-row[i+1])+" ");
		
		if(col[i]-col[i+1]>0)
			System.out.print("left -"+Math.abs(col[i]-col[i+1])+" ");
		else if(col[i]-col[i+1]<0)
			System.out.print("right -"+Math.abs(col[i]-col[i+1])+" ");
			
		}
	}

}
