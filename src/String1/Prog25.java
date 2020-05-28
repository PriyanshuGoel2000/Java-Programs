//accept name, marks of five students and create merit list based on marks.
package String1;
import java.util.*;
public class Prog25 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String name[]=new String[5];
		int marks[]=new int[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Name of Student");
			name[i]=in.next();
			System.out.println("Enter Marks of Student");
			marks[i]=in.nextInt();
			
		}

		System.out.println("Merit List");
		
		System.out.println("Student's Name	|	Marks");
		for(int i=0;i<5;i++)
		{
			System.out.println(name[i]+"		|	"+marks[i]);
			
		}
		
		
	}

}
