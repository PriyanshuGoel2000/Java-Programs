//accept a sentence and display the words having length is greater than 5
package String1;
import java.util.*;
public class Prog20 {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=in.nextLine();
		
		StringTokenizer st=new StringTokenizer(s);
		while (st.hasMoreTokens())
		{
			String s1=st.nextToken();
			if(s1.length()>5)
				System.out.println(s1);
		}
		
		
	}

}
