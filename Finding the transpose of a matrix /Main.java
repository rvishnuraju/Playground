import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int[][] a=new int[r][c];
    
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        a[i][j]=sc.nextInt();
      }
    }
    
    for(int i=0;i<c;i++)
    {
      for(int j=0;j<r;j++)
      {
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
  }
}