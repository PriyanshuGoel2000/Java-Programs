//accept a day name and display the Day number.(eq- Monday --1)
package String1;
import java.util.*;
public class Prog7 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a day");
		String s=in.next();
		s=s.substring(0, 1).toUpperCase()+s.substring(1);
		switch(s)
		{
			case "Monday":System.out.println("Day 1");
			break;
			case "Tuesday":System.out.println("Day 2");
			break;
			case "Wednesday":System.out.println("Day 3");
			break;
			case "Thursday":System.out.println("Day 4");
			break;
			case "Friday":System.out.println("Day 5");
			break;
			case "Saturday":System.out.println("Day 6");
			break;
			case "Sunday":System.out.println("Day 7");
			break;
			default: System.out.println("Wrong Input");
		}
	}

}
