//replace “15 august” with “26 january” and  “independence” with “republic” in the string “15 august is independence day”
package String1;

public class Prog14 {
	public static void main(String args[])
	{
		String s1 = "15 august is independence day";
		System.out.println(s1);
		s1 = s1.replace("15", "26");
         s1 = s1.replace("august", "january");
         s1=s1.replace("independence","republic");
        System.out.println(s1);
	}

}
 	 	