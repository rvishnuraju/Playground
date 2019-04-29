import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner sc=new Scanner(System.in);
      int r=sc.nextInt();
      int c=sc.nextInt();
      for(int i=0;i<r;i++)
      {
        int s=r;
        for(int j=0;j<c;j++)
        {
          
          if(j>=i)
          System.out.print(s);
          else
          {
            System.out.print(s);
            s--;
          }
        }
        System.out.println();
      }
    }
}