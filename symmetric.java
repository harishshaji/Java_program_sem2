import java.util.*;

class symmetric
{	
public static void main(String args[])
{
	int n,i,j;
	int[][] a = new int[10][10];
	int[][] b = new int[10][10];
	int flag = 0;
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter row of your matrix");
	n = s.nextInt();
	System.out.println("enter your matrix element");
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			a[i][j] = s.nextInt();
		}
	}
	System.out.println("your matrix is");
	for(i=0;i<n;i++)
	{
		System.out.println(" ");
		for(j=0;j<n;j++)
		{
			System.out.print(" "+a[i][j]);
		}
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			b[j][i] = a[i][j];
		}
	}
	System.out.println("your transpose matrix is");
	for(i=0;i<n;i++)
	{
		System.out.println(" ");
		for(j=0;j<n;j++)
		{
			System.out.print(" "+b[i][j]);
		}
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			if(b[i][j] != a[i][j])
			{
			flag = 1;
			break;
			}
		}
	}
	
	if (flag == 0)
	{
	
		System.out.println("It is a symmetric matrix");

	}
	else
	{
 		System.out.println("It is not symmetric matrix");
	}	
	
	
	
	
}

}
