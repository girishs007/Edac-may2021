import java.util.*;
class a8
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		int amount=sc.nextInt();
		System.out.println("enter intrest rate");
		int intrestRate=sc.nextInt();
		System.out.println("enter time in years");
		int time=sc.nextInt();
		double SI=(amount*intrestRate*time)/100;
		System.out.println("simple intrest is= "+SI);
	}
}

		