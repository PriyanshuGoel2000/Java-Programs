//accept roll no, name of 5 students and display them back on the screen in tabular form.
package String1;
import java.util.*;
public class Prog23 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String name[]=new String[5];
		int roll[]=new int[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter roll ");
			roll[i]=in.nextInt();
			System.out.println("Enter name ");
			name[i]=in.next();
			
			
		}
			System.out.println("Name	|	Roll. No.");
		
		for(int i=0;i<5;i++)
		{
			System.out.println(name[i]+"	|	"+roll[i]);
			
		}
	}

}
