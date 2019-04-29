import java.util.Scanner;
public class Main{
  public static int gcd(int a,int b)
  {
    if(a==0)
      return a;
    if(b==0)
      return b;
    if(a==b)
      return a;
    if(a>b)
      return gcd(a-b,b);
    return gcd(a,b-a);
  }
  
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int a,b,c;
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      System.out.println(gcd(gcd(a,b),c));
	}
}