//accept  String and Convert its individual characters to capital and Small alternately.(Amar----- aMaR)
package String1;
import java.util.*;
public class Prog17 {
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		System.out.println("Enter a string");
		String s=in.nextLine(),s1="";
		int i,l;
		char ch;
		l=s.length();
		for(i=0;i<l;i++)
		{
			ch=s.charAt(i);
			if(ch==' ')
				s1=s1+' ';
			if(i%2==0)
			{
					s1=s1+Character.toLowerCase(ch);
			}
			else
			{
					s1=s1+Character.toUpperCase(ch);
			}
		}
		System.out.println(s1);
	}

}
