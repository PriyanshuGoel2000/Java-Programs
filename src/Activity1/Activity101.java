//accept a string and reverse it and display
package Activity1;
import java.util.*;
public class Activity101 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=in.nextLine(),s1="";
		int l=s.length();
		for(int i=0;i<l;i++)
		{
			char ch=s.charAt(i);
			s1=ch+s1;
		}
		System.out.println(s1);
	}

}
