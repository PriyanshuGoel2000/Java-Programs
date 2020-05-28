//accept a String and Display it in Title Case.(eq- My name is covid----- My Name Is Covid)
package String1;
import java.util.*;
public class Prog19 {
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("plz enter any String");
        String str,s1 = "";
        char ch;
        int l;
        str = sc.nextLine();
        //str = str.toLowerCase();
        str = " " + str;
        l = str.length();
        for(int i =0;i<l;i++)
        {
          ch = str.charAt(i);
          if(ch == ' ')
          {
             s1 = s1 + ch;
             i++;
             ch = Character.toUpperCase(str.charAt(i));
          }
          else
              ch = Character.toLowerCase(str.charAt(i));
          s1 = s1 + ch;
        }
        System.out.println(s1.trim());
        
    }

}
