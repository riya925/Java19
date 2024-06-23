import java.util.*;

public class trans
{
	public static void main(String[] st)
	{
		int i,j,r,c;
		Scanner scan=new Scanner(System.in);
		
		System.out.print("\n Enter the row size : ");
		r=scan.nextInt();
		System.out.print("\n Enter the column size : ");
		c=scan.nextInt();
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print("\n Enter the elemnts of first matrix : ");
				a[i][j]=scan.nextInt();
			}
		}
		
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.print(" "+y);
			}
			System.out.print("\n");
		}

		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		
		System.out.println("\n Matrix after transpose.... ");
		for(int x[]:b)
		{
			for(int y:x)
			{
				System.out.print(" "+y);
			}
			System.out.print("\n");
		}
	}
}