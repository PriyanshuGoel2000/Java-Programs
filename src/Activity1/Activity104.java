//to find the frequency of every character present in a string
package Activity1;
import java.util.*;
public class Activity104 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=in.nextLine();
		int l = s.length();
		
	      char ch[]=s.toCharArray();
	      for(int i=0;i<l;i++)
	      {
	            
	          int count = 1;
	          for(int j=i+1;j<l;j++)
	         {
	        	  
	            if(ch[i]==ch[j])
	            {
	               count++;
	               ch[j]='0';
	               
	            }
	         }
	          
	         if(count>0&&ch[i]!='0')
	         {
	             System.out.println("The Frequency of" + " " + ch[i] + " is " + count);
	         }
	      }
	}

}
