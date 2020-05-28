 //accept a sentence and extract the palindrome words.
package String1;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Prog21 {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=in.nextLine();
		
		StringTokenizer st=new StringTokenizer(s);
		while (st.hasMoreTokens())
		{
			String s1=st.nextToken(),s2="";
			int l=s1.length();
			for(int i=0;i<l;i++)
			{
				s2=s1.charAt(i)+s2;
			}
			if(s1.equalsIgnoreCase(s2))
				System.out.println(s1);
			s2="";
		}
		
		
	}

}
