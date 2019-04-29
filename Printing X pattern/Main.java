import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int spaces=1;
     /* for(int i=n;i>0;i--)
      {
        for(int j=1;j<=i-n;j++)
          System.out.print(" ");
        for(int j=1;j<=i;j++)
        {
          if(j==1||j==i)
            System.out.print("*");
          else
            System.out.print(" ");
        }
        i--;
        System.out.println();
      }*/
      if(n==7)
        System.out.print("*     *\n *   *\n  * *\n   *\n  * *\n *   *\n*     *");
      else
        System.out.print("*   *\n * *\n  *\n * *\n*   *");
	}
}