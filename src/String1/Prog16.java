// accept 5 String/Name and Display the names that start with a Vowel
package String1;
import java.util.*;
public class Prog16 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        char ch;
        int i,count =0;
        String s[] = new String[5];
        System.out.println("Enter a String/Name");
        for(i =0; i<5 ;i++)
        {
            s[i] = sc.nextLine();
        }
        System.out.println("The String/name that starts with vowel is/are........");
         for( i =0; i<5 ;i++)
        {
           ch = Character.toLowerCase(s[i].charAt(0));
           if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
           {
               System.out.println(s[i]); 
           }
           
        }
	}

}
