// assign 7 country names and corresponding wonder names in two separate arrays and after that search a given country name and display related wonder name.
package String1;
import java.util.*;
public class Prog24 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Name of the Country and their Wonder Name:");
		String country[]=new String[7];
		String wonder[]=new String[7];
		for(int i=0;i<7;i++)
		{
			System.out.println("Enter Name of the Country :");
			country[i]=in.nextLine();
			System.out.println("Enter Wonder Name:");
			wonder[i]=in.nextLine();
		}
		System.out.println("Enter Name of the Country for Wonder Name:");
		String s=in.nextLine();
		for(int i=0;i<7;i++)
		{
			if(s.equalsIgnoreCase(country[i]))
			{
				System.out.println("Wonder name is: "+wonder[i]);
			}
		}
		
		
	}

}
