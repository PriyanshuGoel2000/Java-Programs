//assign some values in two arrays an merge them into third array.
package ArrayLevel1;
import java.util.*;
public class Prog5 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no of elements in Array 1");
		int n1=in.nextInt();
		System.out.println("Enter no of elements in Array 2");
		int n2=in.nextInt();
		int a[]=new int[n1];
		int b[]=new int[n2];
		int c[]=new int[n2+n1];
		System.out.println("Enter elements of Array 1");
		for(int i=0;i<n1;i++)
		{
			 a[i]=in.nextInt();
		}
		System.out.println("Enter elements of Array 2");
		for(int i=0;i<n2;i++)
		{
			 b[i]=in.nextInt();
		}
		System.out.println("Elements of Array after merging are: ");
		for(int i=0;i<n1;i++)
		{
			c[i]=a[i]; 
		}
		for(int i=0;i<n2;i++)
		{
			 c[n1+i]=b[i];
		}
		for(int i=0;i<n1+n2;i++)
		{
			System.out.println(c[i]);
		}
	}

}
