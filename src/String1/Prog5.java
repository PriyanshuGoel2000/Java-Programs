// accept a string and count number of Words Present in it.(eq- Amar  Singh-- 2)
package String1;
import java.util.Scanner;
public class Prog5 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String");
		char ch;int i,l,c=0;
		String s=in.nextLine();
		s=s.trim();
		l=s.length();
		for( i=0;i<l;i++)
		{
			ch=s.charAt(i);
			if(ch==' ')
				c++;
		}
		System.out.println("No of words present is:"+(c+1));
			
	}

}
