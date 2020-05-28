//accept a sentence and display the words having double sequences.(eq- I Like Rabbit---- rabbit)
package String1;
import java.util.*;
public class Prog22 {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=in.nextLine();
		StringTokenizer st=new StringTokenizer(s);
		while(st.hasMoreTokens())
		{
			String s1=st.nextToken();
			int l=s1.length(),c=0;
			for(int i=0;i<l-1;i++)
			{
				if(s1.charAt(i)==s1.charAt(i+1))
					c++;
			}
			if(c==1)
				System.out.println(s1);
		}
	}

}
