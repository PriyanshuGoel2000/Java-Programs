//Replace all the vowels with 'z' and if no vowels are present then display "no vowels present.
package Activity1;
import java.util.*;
public class Activity102 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=in.nextLine(),s1= "";
		int l=s.length(),c=0;
		for(int i=0;i<l;i++)
		{
			char ch=s.charAt(i);
			if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' ||     ch=='u' || ch=='U')
			{
				s1=s1+'z';
				c++;
			}
			else
			{
				s1=s1+ch;
			}
		}
		if(c==0)
			System.out.println("No vowels present");
		else
			System.out.println(s1);
	}

}
