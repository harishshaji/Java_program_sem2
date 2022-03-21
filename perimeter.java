import java.util.Scanner;

class rect
{
	int a,b,c;
	rect()
	{
		a=10;
		b=20;	
	}
	rect(int a,int b)
	{
		this.a=a;
		this.b=b;
	}

	public void peri()
	{
	c = 2*(a+b);
	System.out.println(c);
	
	}
}

class perimeter
{
 
	public static void main(String[] args)
	{	
		int a,b;
		rect ob1 = new rect();
		ob1.peri();
		Scanner s = new Scanner(System.in);
		System.out.println("enter length of rectangle\n");
		a = s.nextInt();

		System.out.println("enter breadth of rectangle\n");
		b = s.nextInt();
		rect ob2 = new rect(a,b);
		ob2.peri();
	}
}
