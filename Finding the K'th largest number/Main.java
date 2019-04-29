import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      int k=sc.nextInt();
      int max=0,index;
      while(k>0)
      {
        max=a[0];
        index=0;
        for(int i=1;i<n;i++)
        {
          if(max<a[i])
          {
            max=a[i];
            index=i;
          }
        }
        a[index]=-1;
        k--;
      }
      System.out.print(max);
    }   
}