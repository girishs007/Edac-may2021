import java.util.*;
class a13
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a three number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("greater num is"+a);
		}
			if(b>c && b>a)
		{
			System.out.println("greater num is"+b);
		}else
		{
			System.out.println("greater num is"+c);
		}
	}
}
