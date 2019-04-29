import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int in[]=new int[10];
      int max=0;
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
        if(a[i]>max)
          max=a[i];
        in[a[i]]=1;
      }
      for(int i=1;i<max;i++)
      {
        if(in[i]==0)
          System.out.print(i);
      }
    }
}