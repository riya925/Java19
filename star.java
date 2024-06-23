import java.util.*;

public class star
{
	public static void main(String[] args)
	{
		int i,j,k;
		for(i=0;i<3;i++)
		{
			for(j=0;j<=i;j++)
			{
				for(k=3;k>i;k--)
				{
					System.out.print(" ");
				}
				System.out.print("* ");
			}
			System.out.println();
		}

		for(i=0;i<3;i++)
		{
			for(k=2;k>i;k--)
			{
				for(j=0;j<=i;j++)
				{
					System.out.print(" ");
				}
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}