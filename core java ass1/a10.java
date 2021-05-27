import java.util.*;
class a10
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a fahrenhite value");
		double Fahrenheit=sc.nextDouble();
		double celcius=5*(Fahrenheit-32)/9;
		System.out.println("fahrenheit to celcius= " +celcius);
	}
}
