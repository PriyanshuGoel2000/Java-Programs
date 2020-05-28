//accept  word and check if it is palindrome
package String1;
import java.util.*;
public class Prog9 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=in.nextLine(),s1="";
		int i,l;
		char ch;
		l=s.length();
		for(i=0;i<l;i++)
		{
			ch=s.charAt(i);
			s1=ch+s1;
		}
		if(s1.equalsIgnoreCase(s))
			System.out.println("It is Palindrome");
		else
			System.out.println("It is not plaindrome");
		
	}
}
