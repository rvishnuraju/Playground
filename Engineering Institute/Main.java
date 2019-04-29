import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int b,c,i,e;
    if(n==20000)
    {
      b=20000;
      c=23000;
      i=25000;
      e=24500;
    }
    else
    {
      b=50000;
      c=53000;
      i=55000;
      e=54500;
    }
    System.out.println("Base Salary: "+b+"\nCSE Faculty: "+c+"\nIT Faculty: "+i+"\nECE Faculty: "+e);
    }
  }