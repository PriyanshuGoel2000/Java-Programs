//accept a string and count number of Vowels present in it
package String1;
import java.util.*;
public class Prog4 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
        System.out.println("Enter String");
        String s;
        int l;
        char ch;int count =0;
        s = in.nextLine();
        l = s.length();
        for(int i =0 ;i<l;i++)
        {
            ch = Character.toLowerCase(s.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
            }
        }
        System.out.println("The Total no. Vowel " + count);
	}
}
