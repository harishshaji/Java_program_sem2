import java.util.*;
class complexadd
{
  int real;
  int imag;
  
  complexadd(int real,int imag)
  {
    this.real = real;
    this.imag = imag;
  }

  void add(complexadd ob2)
  {
    complexadd ob3 = new complexadd(0,0);    
    ob3.real = this.real+ob2.real;
    ob3.imag = this.imag + ob2.imag;
    
    System.out.println("Sum = "+ob3.real+"+"+ob3.imag+"i");

  }


}


public class complex 
{
public static void main(String args[])
{

 Scanner s = new Scanner(System.in);
 System.out.println("Enter the real and imag part of first complex no : ");
 int r = s.nextInt();
 int i = s.nextInt();   
 complexadd obj1 = new complexadd(r,i);

 System.out.println("Enter the real and imag part of second complex no : "); 
 r = s.nextInt();
 i = s.nextInt();   
 complexadd obj2 = new complexadd(r,i);
 obj1.add(obj2);  

}

}
