//accept an Array to accept a Month number and Display the numbr of days that months has.
package ArrayLevel1;
import java.util.*;
public class Prog3 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String month[]= {"january","february","march","april","may","june","july","august","september","october","november","december"};
		int days[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println("Enter a month");
		String s=in.nextLine();
		for(int i=0;i<12;i++)
		{
			if(s.equalsIgnoreCase(month[i]));
			{
				System.out.println("No of days in "+s+" are "+days[i]);
				break;
			}
		}
	}

}
