//accept 10 numbers in an array and search a given number,  if the number exists display its position (index) else display a suitable message.(Linear Search)
package ArrayLevel1;
import java.util.*;
public class Prog6 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of Elements of Array");
		int n=in.nextInt();
		System.out.println("Enter Elements of Array");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("Enter Element to be searched");
		int s=in.nextInt(),c=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==s)
			{
				System.out.println("Enter Element found at "+(i+1));
				c++;
				break;
			}
		}
		if(c==0)
			System.out.println("Element not found");
		
	}

}
