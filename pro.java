import java.util.Scanner;

class product
{
	int pcode,price;
	String pname;
	product(int pc,String pn,int pr)
	{
		pcode=pc;
		pname=pn;
		price=pr;
	}
	
	
}


class pro
{
 
	public static void main(String[] args)
	{
	int pc,pr;
	String pn;
	
	Scanner s = new Scanner(System.in);
	System.out.println("enter product code\n");
	pc = Integer.parseInt(s.nextLine());
	System.out.println("enter product name\n");
	pn = s.nextLine();
	System.out.println("enter product price\n");
	pr = Integer.parseInt(s.nextLine());
	product p1=new product(pc,pn,pr);

	System.out.println("enter product code\n");
	pc = Integer.parseInt(s.nextLine());
	System.out.println("enter product name\n");
	pn = s.nextLine();
	System.out.println("enter product price\n");
	pr = Integer.parseInt(s.nextLine());
	product p2=new product(pc,pn,pr);

	System.out.println("enter product code\n");
	pc = Integer.parseInt(s.nextLine());
	System.out.println("enter product name\n");
	pn = s.nextLine();
	System.out.println("enter product price\n");
	pr = Integer.parseInt(s.nextLine());
	product p3=new product(pc,pn,pr);
	
	
	

	if (p1.price<p2.price && p1.price<p3.price)
	{
	System.out.println(p1.pname+" is lowest");
	}
	else if (p2.price<p1.price && p2.price<p3.price)
	{
	System.out.println(p2.pname+" is lowest");
	}
	else
	{
	System.out.println(p3.pname+" is lowest");
	}
	
	}

}

