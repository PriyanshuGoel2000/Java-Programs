//find the Sum of Numbers of each array.
package ArrayLevel1;
import java.util.*;
public class Prog1 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no of elements of Array");
		int n=in.nextInt(),sum=0;
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
		System.out.println(sum);
		
	}

}
