class child implements Runnable
{
	Thread th;
	int i,a;
	child(String na,int a)
	{
		th=new Thread(this,na);
		this.a=a;
		th.start();
	}
	public void run()
	{
		for(i=a;i<(a+10);i++)
		{
			System.out.println(" "+th.getName()+":"+i);
			try
			{
				th.sleep(500);
			}
			catch(Exception e) { }
		}
	}
}

public class Threa
{
	public static void main(String[] st)
	{
		child c1=new child("ABC",1);
		try
		{
			c1.th.join();
		}
		catch(Exception e) { }

		child c2=new child("DEF",11);
		try
		{
			c2.th.join();
		}
		catch(Exception e) { }

		child c3=new child("GHI",21);
		try
		{
			c3.th.join();
		}
		catch(Exception e) { }
	}
}