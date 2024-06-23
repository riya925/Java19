import java.util.*;

public class rev
{
	public static void main(String[] st)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("\n Enter the string : ");
		String s1=scan.nextLine();
		StringBuilder sb=new StringBuilder(s1);
		/*String r="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			r=r+s1.charAt(i);
		}*/
		System.out.print("\n Reversed string is : "+sb.reverse().toString());
	}
}
		