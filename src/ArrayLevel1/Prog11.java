//accept N integers from user and Count how many of them are positive.
package ArrayLevel1;

import java.util.Scanner;

public class Prog11 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of Elements");
		int n=in.nextInt(),c=0;
		System.out.println("Enter Elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]>0)
				c++;
		}
		System.out.println("No of positive numbers are "+c);
		
	}

}
