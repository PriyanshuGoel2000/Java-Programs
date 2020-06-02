//accept 5 numbers in an array and search a given number. If the number exists display its frequency else display a suitable message.
package ArrayLevel1;

import java.util.Scanner;

public class Prog7 {
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
				
			}
		}
		if(c==0)
			System.out.println("Element not found");
		else
			System.out.println("Element is present "+c+" times");
	}

}
