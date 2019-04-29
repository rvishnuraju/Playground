import java.util.*;
class Main
{
  public static int power(int a,int b)
  {
    int res=1;
    for(int i=1;i<=b;i++)
      res*=a;
    return res;
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a,b;
    a=sc.nextInt();
    b=sc.nextInt();
    int res=power(a,b);
    System.out.println(res);
  }
}