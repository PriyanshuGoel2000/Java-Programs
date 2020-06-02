//to accept an Array input from an User. and find the Average of Numbers of each array.
package ArrayLevel1;
import java.util.Scanner;
public class Prog2 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no of elements of Array");
		int n=in.nextInt(),sum=0;
		float avg;
		int ar[]=new int[n];
		System.out.println("Enter elements of Array");
		for(int i=0;i<n;i++)
		{
			 ar[i]=in.nextInt();
		}
		System.out.println("Sum is: ");
		for(int i=0;i<n;i++)
		{
			sum=sum+ar[i];
		}
		avg=sum/n;
		System.out.println("Average is: "+avg);
		
	}

}
