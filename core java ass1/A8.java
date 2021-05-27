import java.util.*;
public class A8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of days");
		int d=sc.nextInt();
		int year,month,days;
		year=d/365;
		d=d%365;
		System.out.println("no of year=" +year);
		month=d/30;
		d=d%30;
		System.out.println("no of month="+month);
		days=d;
		System.out.println("no of days "+d);
		
		
		

	}

}
