//accept a String and Convert the case of each alphabet present in it.(eq- JaVa---jAvA)
package String1;
import java.util.*;
public class Prog8 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=in.nextLine(),s1="";
		char ch;
		int i,l;
		l=s.length();
		for(i=0;i<l;i++)
		{
			ch=s.charAt(i);
			if(ch==' ')
				s1=s1+' ';
			if(Character.isLowerCase(ch))
				s1=s1+Character.toUpperCase(ch);
			if(Character.isUpperCase(ch))
				s1=s1+Character.toLowerCase(ch);
			
		}
		System.out.println(s1);
	}

}
