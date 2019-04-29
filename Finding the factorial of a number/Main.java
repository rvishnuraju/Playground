import java.util.*;
class Main
{
  public static int fact(int n,int res)
  {
    if(n==0)
      return res;
    else
      return fact(n-1,res*n);
  }
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int res=fact(n,1);
    System.out.print(res);
  }
}