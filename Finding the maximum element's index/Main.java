import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int pos,max,a;
    max=sc.nextInt();
    pos=0;
    for(int i=1;i<n;i++)
    {
        a=sc.nextInt();
        if(a>max)
        {
          max=a;
          pos=i;
        }
    }
    System.out.println(pos);
  }
}