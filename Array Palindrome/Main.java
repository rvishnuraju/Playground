import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int s=sc.nextInt();
      int a[]=new int[s];
      for(int i=0;i<s;i++)
        a[i]=sc.nextInt();
      for( int i=0,j=s-1;i<=j;i++,j--)
      {
        if(a[i]!=a[j])
        {
          System.out.print("No");
          return;
        }
      }
      System.out.print("Yes");
    }
}