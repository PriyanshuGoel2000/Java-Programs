//accept N integers from user and find the Largest/Smallest element in an array.
package ArrayLevel1;

import java.util.Scanner;

public class Prog13 {
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
		int large=arr[0],small=arr[0];
		for(int i=0;i<n;i++)
		{
			if((arr[i]>0) && (arr[i]>large))
			{
				large=arr[i];
			}
			if((arr[i]>0) && (arr[i]<small))
			{
				small=arr[i];
			}
		}
		System.out.println("Largest numbers is "+large);
		System.out.println("Smallest numbers is "+small);
	}

}
