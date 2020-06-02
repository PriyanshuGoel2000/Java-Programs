//assign 10 integers in an array and extract the even element into another array.
package ArrayLevel1;

import java.util.Scanner;

public class Prog17 {
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
		int a[]=new int[100];
		for(int i=0;i<n;i++)
		{
			if((arr[i]>0) && (arr[i]%2==0))
			{
				a[c]=arr[i];
				c++;
				
			}
		}
		System.out.println(" Even numbers are ");
		for(int i=0;i<c;i++)
		{
			System.out.println(a[i]);
		}
	}

}
