//avg of n positive integers,raising a user defined exception for each negetive input

import java.util.*;
class MyException extends Exception {
	public MyException(String s)
	{
	
		super(s);
	}
}


public class avgexception{
	
	public static void main(String args[])
	{
		int n[]=new int[3],k; 
		Scanner s =new Scanner(System.in);
		try 
		{
			System.out.println("enter 3 number");
			for(int i =0;i <3;i++)
			{
			k = s.nextInt();
			if (k <1)
			{
			throw new MyException("");
			}
			else {
			n[i] = k;
			}
			}
			int avg = (n[0]+n[1]+n[2])/3;
					System.out.println(avg);
			
		}
		
		catch (MyException ex) {
			System.out.println("exception caught");

		
			System.out.println(ex.getMessage());
		}
	}
}

