import java.util.*;

class employee
{
	int id;
	String na,dep;
	double s,hra=0,da=0,pf=0,t=0,ns=0;
	Scanner scan=new Scanner(System.in);
	employee(int id,String na,String dep)
	{
		this.id=id;
		this.na=na;
		this.dep=dep;
	}
	void input()
	{
		System.out.print("\n Enter the salary : ");
		s=scan.nextDouble();
		hra=(s*0.1);
		da=(s*0.01);
		pf=(s*0.01);
		t=s+hra+da;
		ns=t-pf;
	}
	void show()
	{
		System.out.print("\n Id is : "+id);
		System.out.print("\n Name is : "+na);
		System.out.print("\n Department is : "+dep);
		System.out.print("\n Salary is : "+s);
		System.out.print("\n HRA is : "+hra);
		System.out.print("\n DA is : "+da);
		System.out.print("\n PF is : "+pf);
		System.out.print("\n Total salary is : "+t);
		System.out.println("\n Net Salary is : "+ns);
	}
}

class sal
{
	public static void main(String[] st)
	{
		employee e1=new employee(Integer.parseInt(st[0]),st[1],st[2]);
		e1.input();
		e1.show();
	}
}