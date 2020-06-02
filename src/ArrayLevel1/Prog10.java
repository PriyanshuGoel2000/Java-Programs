//assign 10 numbers in an array and Sort it is ascending  order using Selection  sort technique.
package ArrayLevel1;

import java.util.Scanner;

public class Prog10 {
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
		for (int i = 0; i < n- 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < n; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }
		System.out.println("Array after sorting is: ");
		for(int i=0;i<n;i++)
		{

			System.out.println(arr[i]);
		}
	}
}
