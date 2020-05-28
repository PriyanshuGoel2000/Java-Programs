// accept two strings and tell which comes later in lexicographics order(dictionary order). If equal how appropriate message.
package String1;
import java.util.*;
public class Prog13 {
	public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       
       int a;
       String s,s1;
       System.out.println("Enter a string");
       s = sc.nextLine();
       System.out.println("Enter another string");
       s1 = sc.nextLine();
       a = s.compareToIgnoreCase(s1);
       if(a == 0)
       {
           System.out.println("Same string");
       }
       else if(a>0)
       {
           System.out.println(s  + " Comes later");  
       }
       else
       {
           System.out.println(s1 + " comes later");
       }
        
    }

}
