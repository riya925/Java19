import java.io.*;

public class revcopy
{
	public static void main(String[] st)
	{
		try
		{
			String fna=st[0];
			String f=st[1];
			String data="";
			
			FileInputStream fin=new FileInputStream(fna);
			
			int n=0;
			while(n!=-1)
			{
				n=fin.read();
				if(n!=-1)
				{
					data=data+(char)n;
				}
			}
			fin.close();
			
			StringBuffer sb=new StringBuffer(data);
			data=sb.reverse().toString();
			FileWriter fw=new FileWriter(f);
			fw.write(data);
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
		}
	}
}