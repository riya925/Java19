class child implements Runnable
{
	Thread th;
	int a,x,n,flag;
	child(int a,int flag)
	{
		th=new Thread(this);
		this.a=a;
		this.flag=flag;
		th.start();
	}
	child(int x,int n,int flag)
	{
		th=new Thread(this);
		this.x=x;
		this.n=n;
		this.flag=flag;
		th.start();
	}
	int fact()
	{
		int f=1;
		for(int i=1;i<=a;i++)
		{
			f=f*i;
		}
		return f;
	}
	int power()
	{
		int p=1;
		for(int i=1;i<=n;i++)
		{
			p=p*x;
		}
		return p;
	}	
	public void run()
	{
		if(flag==0)
		{
			System.out.println("Factorial method : "+fact());	
		}
		else
		{
			System.out.println("Power method : "+power());		
		}
	}	
}

public class Threads
{
	public static void main(String[] st)
	{
		int a=Integer.parseInt(st[0]);
		int x=Integer.parseInt(st[1]);
		int n=Integer.parseInt(st[2]);
		
		child c1=new child(a,0);
		child c2=new child(x,n,1);
	}
}