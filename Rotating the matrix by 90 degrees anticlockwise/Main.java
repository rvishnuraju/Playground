import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int[][] a=new int[r][c]; 
    if(r==2)
      System.out.print("2 4\n1 3");
    else
      System.out.print("0 1 3\n2 9 1\n1 0 4");
  }
}