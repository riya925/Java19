import java.util.*;

public class sort
{
	public static void main(String[] args)
	{
		int i,j,n;

		Scanner scan=new Scanner(System.in);
		System.out.print("\n ENTER THE SIZE OF ARRAY : ");
		n=scan.nextInt();

		int a[]=new int[n];
		for(i=0;i<a.length;i++)
		{
			System.out.print("\n ENTER THE ELEMENTS : ");
			a[i]=scan.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print("\n ARRAY BEFORE SORTING.... "+a[i]);
		}
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int t;
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println();
		for(i=0;i<a.length;i++)
		{
			System.out.print("\n ARRAY AFTER SORTING.... "+a[i]);
		}
		System.out.println();
	}
}