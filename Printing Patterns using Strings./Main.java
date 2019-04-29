import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String s=new String(sc.nextLine());
    int n=s.length();
    String sub=s.substring(0,n/2);
    String sub1=s.substring(n/2,n);
    String newS=sub1+sub;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n-i-1;j++)
        System.out.print(" ");
      for(int j=0;j<=i;j++)
        System.out.print(newS.charAt(j));
      System.out.println();
    }
  }
}