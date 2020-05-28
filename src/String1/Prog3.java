//accept a String and Count number of Capital letters present in it.(eq- ComPuter - 2)
package String1;

import java.util.Scanner;


public class Prog3
{
    public static void main(String[] args)
    {    
        Scanner sc = new Scanner(System.in);
        int l;
        String name ;
        char ch;
       int c=0;
       System.out.println("Plz Enter ur Name");
        name = sc.nextLine();
        l = name.length();
        for(int i =0 ; i< l ;i++)
        {
            ch = name.charAt(i);
            
            if(Character.isUpperCase(ch))
                c++;
      }
        System.out.println("No of a Capital Letters is " + c);
        
    }
    
}
