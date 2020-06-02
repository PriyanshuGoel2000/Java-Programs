//assign a set of numbers in an Array and display it is Reverse
package ArrayLevel1;
import java.util.*;
public class Prog4 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		String s=in.nextLine();
		int l=s.length();
		int n=Integer.parseInt(s),z=n; 
		int a[]=new int[l];
		for(int i=0;i<l;i++)
		{
			a[i]=n%10;
			n=n/10;
		}
		System.out.print("Reverse number is: ");
		for(int i=0;i<l;i++)
		{
			System.out.print(a[i]);
		}
	}

}
