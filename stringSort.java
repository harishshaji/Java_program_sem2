import java.util.*;

public class stringSort
{
    public static void main(String[] args)
    {
        String[] arr = new String[10];
        System.out.println("enter 4 strings");
        Scanner s = new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
       	  arr[i] = s.next(); 
        }
        
       for(int i=0;i<4;i++)
       {
       	 for(int j=0;j<4;j++)
       	 {
       	 	if(arr[i].compareTo(arr[j])<1)
       		{
       	 		String temp;
       	 		temp = arr[i];
       	 		arr[i] = arr[j];
       	 		arr[j] = temp;
       	 	}
       	 }
        
       }
       System.out.println("____....After sorting....____");
       for(int i=0;i<4;i++)
       {
					System.out.println(arr[i]);
       }
    } 
}
