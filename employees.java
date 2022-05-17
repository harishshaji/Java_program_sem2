import java .util.*;
class employee
{
	int eNo,eSalary;
	String eName;
	
	employee(int eno,int esalary,String ename)
	{
	this.eNo = eno;
	this.eSalary = esalary;
	this.eName = ename;
	}
	public void show()
	{
	System.out.println(this.eNo+" "+this.eSalary+" "+this.eName);
	}
}
class employees
{
	public static void main(String[] args)
	{
		int n,eno,salary,search;
		int count = 1;
		String ename;
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of employee");
		n = s.nextInt();
		employee[] e = new employee[n];
		for(int i=0;i<n;i++)
		{
					System.out.println("enter employee number,salary,ename");
					eno = s.nextInt();
					salary = s.nextInt();
					ename = s.next();
					e[i] = new employee(eno,salary,ename);

		}	
		for(int i=0;i<n;i++)
		{
					e[i].show();
		}
		
		System.out.println("Enter an employee number to search");
		search = s.nextInt();
		
		for(int i= 0;i<n;i++)
		{
			if(e[i].eNo == search)
			{
					System.out.println("Employee found");
					e[i].show();
					count = 0;
					break;
					
			}
		}
		if (count == 1)
		{
		System.out.println("Employee not found");
		}
		
	}
}
	
	

