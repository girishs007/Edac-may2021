import java.util.*;
class a7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number of Subject");
		
		int n=sc.nextInt();
		int sum=0;
		float percentage;
		int arr[]=new int[n];
		System.out.println("Enter The mark of Subject");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		   
			
		} 
		System.out.println("sum of marks= " +sum);
		
		    percentage=sum/n;
		    System.out.println("percentage= "+percentage);
	
		
	}
}

	
			