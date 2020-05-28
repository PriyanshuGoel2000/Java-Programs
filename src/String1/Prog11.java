// accept a word and convert it to piglatin form(trouble --- oubletray)
package String1;
import java.util.*;
public class Prog11 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a String");
	      String s,s1= "";
	      int l,i;
	      char ch;
	      s = sc.nextLine();
	      s = s.toLowerCase();
	      l = s.length();
	      for(i =0;i<l;i++)
	      {
	        ch = s.charAt(i);
	        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	        {
	            break;
	        }
	      }
	      s1= s.substring(i)+s.substring(0, i)+ "ay";
	       System.out.println("Piglatin form is  " + s1);
	}

}
