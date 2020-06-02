//accept 10 numbers in an array and search a given number,  if the number exists display its position (index) else display a suitable message.(Binary Search)

package ArrayLevel1;
import java.util.*;
public class Prog8 {
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
		int key=in.nextInt(),c=0,first=0,last=n;
		int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( a[mid] < key ){  
		        first = mid + 1;     
		      }else if ( a[mid] == key ){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }  
	}
	

}
