import java.util.*;
class a11
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter value of x");
		System.out.println("enter value of y");
		int x=sc.nextInt();
		System.out.println("x= "+x);
		
		int y=sc.nextInt();
		System.out.println("y= "+y);
		{
			x=y+x;
			y=x-y;
			x=x-y;
			System.out.println("x= "+x);
			System.out.println("y= "+y);
		}
	}
}

		