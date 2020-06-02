//to accept 10 integers in an array and display the non-repeating Array (eq-  1, 2 , 3, 5, 6, 7, 2, 3 , 5)--- 1,6,7
package ArrayLevel1;

import java.util.Scanner;

public class Prog16 {
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
		for(int i=0;i<n;i++)
		{
			int c=0;
			for(int j=0;j<n;j++)
			{
				if(a[i]==a[j])
				{					
					c++;	
				}
			}
			if(c==1)
				System.out.println("Non Repeating Element is "+a[i]);

				}
	}
}
	



