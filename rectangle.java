import java.util.Scanner;

class rect
{	
		int l,b,a;
		
		
		public int area()
		{
		Scanner s = new Scanner(System.in);
		System.out.println("enter length of rectangle\n");
		l = s.nextInt();
		System.out.println("enter breadth of rectangle\n");
		b = s.nextInt();
		a = l*b;
		return a;
		}
}		

class rectangle
{
public static void main(String[] args)
{
int a,b;
rect ob1 = new rect();
rect ob2 = new rect();
System.out.println("initializing first object\n");
a = ob1.area();
System.out.println("initializing second object\n");
b = ob2.area();
System.out.println("result of first rectangle\n");
System.out.println(a);
System.out.println("result of second rectangle\n");
System.out.println(b);
}
}		
		
	
