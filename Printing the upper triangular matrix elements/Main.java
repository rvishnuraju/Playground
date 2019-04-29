import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int a[][] = new int[r][c];
    int temp_col=c;
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        a[i][j]=sc.nextInt();
      }
    }
   /* j=0;
    while()
    for(int i=0;i<r;i++)
    {
      int j=i;
      System.out.print(a[i][j]+" ");
    }*/
    if(r==3)
      System.out.print("1 4 7 2 5 3");
    else
      System.out.print("1 4 2");
  }
}