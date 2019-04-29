import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int max=0;
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    int prev=a[0];
    max=a[0];
    int sum=a[0];
    for(int i=1;i<n;i++)
    {
      if(a[i]<prev)
      {
        sum=a[i];
      }
      else
      {
        sum+=a[i];
      }
      if(sum>max)
        max=sum;
      prev=a[i];
    }
    if(sum>max)
      max=sum;
    System.out.print(max);
  }
}