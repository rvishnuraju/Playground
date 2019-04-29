import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      for(int i=0;i<n-2;i++)
      {
        for(int j=i+1;j<n-1;j++)
        {
          for(int k=j+1;k<n;k++)
          {
              System.out.print("("+a[i]+", "+a[j]+", "+a[k]+") ");
          }
        }
        System.out.println();
      }
      System.out.println();
    }
}