
//accept N integers from user and find average of Even elements present in it.
package ArrayLevel1;

import java.util.Scanner;

public class Prog12 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of Elements");
		int n=in.nextInt(),c=0,sum=0;
		System.out.println("Enter Elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if((arr[i]>0) && (arr[i]%2==0))
			{
				c++;
				sum=sum+arr[i];
			}
		}
		System.out.println("Average of Even numbers is "+(sum/c));
		
	}

}
