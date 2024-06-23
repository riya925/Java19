import java.io.*;

public class size
{
	public static void main(String[] st)
	{
		File f=new File(st[0]);
		int no=Integer.parseInt(st[1]);
		String cont[]=f.list();

		for(int i=0;i<cont.length;i++)
		{
			if(f.length()>no)
			{
				System.out.println("\n"+cont[i]+"Is a file");
			}
		}
	}
}