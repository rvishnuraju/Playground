import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int max=-1;
    int val=0;
    for(int i=0;i<n-1;i++)
    {
      int count=0;
      for(int j=i+1;j<n;j++)
      {
        if(a[i]==a[j])
          count++;
      }
      if(count>max)
      {
        val=a[i];
        max=count;
      }
    }
    System.out.print(val);
  }
}