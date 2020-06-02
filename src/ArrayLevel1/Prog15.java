//find the Prime numbers present in a predefined integer array.
package ArrayLevel1;

import java.util.Scanner;

public class Prog15 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of Elements of Array");
		int n=in.nextInt();
		System.out.println("Enter Elements of Array");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int c=0;
			if(arr[i]==1)
			{
				System.out.println("CoPrime number is : "+arr[i]);
				continue;			
			}
			for(int j=2;j<arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					c++;
					break;
				}
			}
			if(c==0)
				System.out.println("Prime number is : "+arr[i]);
		}
		
	}

}
