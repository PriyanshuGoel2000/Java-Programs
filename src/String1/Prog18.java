//accept a String count the frequency of each alphabet in the String.
package String1;
import java.util.*;
public class Prog18 {

	 public static void main(String[] args)
	    {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a String");
	      String str;
	      int l;
	      str = sc.nextLine();
	      str = str.toLowerCase();
	      l = str.length();
	      char ch, cs;
	      for(cs='a';cs<='z';cs++)
	      {
	          int count = 0;
	         for(int i=0;i<l;i++)
	         {
	            ch = str.charAt(i);
	            if(ch==cs)
	            {
	               count++; 
	            }
	         }
	          
	         if(count>0)
	         {
	             System.out.println("The Frequency of "+ cs + " is " + count);
	         }
	      }
	        
	      
	    }
}
