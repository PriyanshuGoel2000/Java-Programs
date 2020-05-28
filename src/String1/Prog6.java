//Java String Comparison 2 String
package String1;
import java.util.*;
public class Prog6 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=in.nextLine();
		System.out.println("Enter a String");
		String s2=in.nextLine();
		if(s1.equalsIgnoreCase(s2))
			System.out.println("They are same");
		else
			System.out.println("They are not same");
	}

}
