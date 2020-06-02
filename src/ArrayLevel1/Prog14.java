//accept N integers from user and find the Second largest/Second Smallest element.
package ArrayLevel1;

import java.util.Scanner;

public class Prog14 {
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
		int temp = 0;  
		for(int i=0; i < n; i++){  
             for(int j=1; j < (n-i); j++){  
                      if(arr[j-1] > arr[j]){  
                             //swap elements  
                             temp = arr[j-1];  
                             arr[j-1] = arr[j];  
                             arr[j] = temp;  
                     }  
                      
             }  
     }
		System.out.println("Second Largest number is "+arr[n-2]);
		System.out.println("Second Smallest number is "+arr[1]);
	}


}
