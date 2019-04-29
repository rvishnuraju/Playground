import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int i=0;
    int s=sum(a,i,n);
    i=3;
    while(i<n)
    {
      if(sum(a,i,n)!=s)
      {
        System.out.println("Not a Perfect Batch");
        return;
      }
      i+=3;
    }
    System.out.println("Perfect Batch");
  }
  public static int sum(int a[],int i,int n)
  {
    int s=0;
    if(i+3>n)
      return 0;
      for(int j=i;j<i+3;j++)
        s+=a[j];
    return s;
  }
}