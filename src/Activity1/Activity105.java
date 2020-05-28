package Activity1;

import java.util.Scanner;

public class Activity105 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=in.nextLine();
		System.out.println("Enter another String");
		String s2=in.nextLine();
		int l=s2.length();
		String s3=s1;
		for(int i=0;i<l;i++)
		{
			s3=s3+s2.charAt(l-i-1);
		}
		System.out.println(s3);
	}


}
