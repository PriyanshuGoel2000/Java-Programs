//Concatinate two strings
package Activity1;
import java.util.*;
public class Activity103 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=in.nextLine();
		System.out.println("Enter another String");
		String s2=in.nextLine();
		String s3=s1+s2;
		System.out.println("Concatenated String is: "+s3);
		
	}

}
