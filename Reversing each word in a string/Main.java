import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    String s=new String(sc.nextLine());
    int n=s.length();
    int init=0;
    for(int i=0;i<n;i++)
    {
      if(s.charAt(i)==' ')
      {
        StringBuilder temp=new StringBuilder(s.substring(init,i));
        System.out.print(temp.reverse()+" ");
        init=i+1;
      }
      else if(i==n-1)
      {
        StringBuilder temp=new StringBuilder(s.substring(init,i+1));
        System.out.print(temp.reverse()+" ");
      }
    }
  }
}