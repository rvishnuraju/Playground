import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String[] s=new String[n+1];
    for(int i=0;i<=n;i++)
    {
      s[i]=new String(sc.nextLine());
    }
   for(int i=0;i<=n;i++)
    {
      for(int j=i+1;j<=n;j++)
      {
        if(s[i].compareTo(s[j])>0)
        {
          String temp=new String(s[i]);
          s[i]=s[j];
          s[j]=temp;
        }
      }
    }
    for(int i=1;i<=n;i++)
      System.out.print(s[i].toLowerCase()+"\n");
  }
}