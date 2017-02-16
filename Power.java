import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=Integer.parseInt(s.next());
		int m=Integer.parseInt(s.next());
		long  k=(long) ((Math.pow(2,n)-2)%m);
		System.out.println(k);

	}

}
