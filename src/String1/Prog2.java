//accept the First name , Middle Name and Last Name of a person and display full name  and Short Name (eq- Amar Kumar Singh-   A.K.S)
package String1;
import java.util.Scanner;
public class Prog2 {
public static void main(String args[])
{
	Scanner in =new Scanner(System.in);
	System.out.println("Enter First Name");
	String first=in.next();
	System.out.println("Enter Middle Name");
	String middle=in.next();
	System.out.println("Enter Last Name");
	String last=in.next();
	System.out.println("Your Name is .... "+first+" "+middle+" "+last);
	System.out.println(first.charAt(0)+"."+middle.charAt(0)+"."+last.charAt(0));
}
}
