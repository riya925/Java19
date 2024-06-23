import java.util.*;

public class reverse
{
	public static void main(String[] args)
	{
		int n,r=0;
		Scanner scan=new Scanner(System.in);
		System.out.print(" ENTER THE NO TO FIND REVERSE : ");
		n=scan.nextInt();
		while(n!=0)
		{
			r=r*10;
			r=r+n%10;
			n=n/10;
		}
		System.out.print("\n THE REVERSE NUMBER IS : "+r);
	}
}
		 