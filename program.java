import java.util.*;

class resturant
{
	int ch=0,tb=0;
	Scanner scan;
	resturant()
	{
		scan=new Scanner(System.in);
	}
	void starter()
	{
		System.out.println("\nNo. List         Rupees ");
		System.out.println("\n 1. Soup           100/-");
		System.out.println("\n 2. Manchurian     200/-");
		System.out.println("\n 3. Hakka noodles  300/-");
		System.out.println("\n 4. Chips          150/-");
		System.out.println("\n Select your choice : ");
		ch=scan.nextInt();
	}
	void maincourse()
	{
		System.out.println("\nNo. List          Rupees ");
		System.out.println("\n 1. Papad           10/-");
		System.out.println("\n 2. Paneer tikha    240/-");
		System.out.println("\n 3. Kaju masala     260/-");
		System.out.println("\n 4. Tandoori roti   15/-");
		System.out.println("\n 5. Masala rice     230/-");
		System.out.println("\n 6. Curd            50/-");
		System.out.println("\n Select your choice : ");
		ch=scan.nextInt();

	}
	void desert()
	{
		System.out.println("\nNo. List                  Rupees ");
		System.out.println("\n 1. Choco chips             75/-");
		System.out.println("\n 2. Single sunday          120/-");
		System.out.println("\n 3. Strawberry              90/-");
		System.out.println("\n 4. Brownie                130/-");
		System.out.println("\n 5. Cold coco               30/-");
		System.out.println("\n 6. Kasatta                190/-");
		System.out.println("\n 7. Rajasthani ice-cream   140/-");
		System.out.println("\n Select your choice : ");
		ch=scan.nextInt();

	}
	void bill()
	{
		System.out.println("\n Total bill is : "+tb);
	}
}
public class program
{
	public static void main(String[] st)
	{
		Scanner sc=new Scanner(System.in);
		int ch=0;
		resturant r1=new resturant();
		while(ch!=5)
		{
			System.out.print("\n MENU IS.... ");
			System.out.println("\n 1.Starter ");
			System.out.println("\n 2.Main course ");
			System.out.println("\n 3.Desert ");
			System.out.println("\n 4.Bill ");
			System.out.println("\n 5.Exit ");
			System.out.println("\n Select a choice : ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:r1.starter();
					break;
				case 2:r1.maincourse();
					break;
				case 3:r1.desert();
					break;
				case 4.r1.bill();
					break;
			}
		}
	}
}	 