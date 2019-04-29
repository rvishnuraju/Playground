import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=0;
      for(int i=1;i<=n;i++)
      {
        for(int j=n-i;j>0;j--)
          System.out.print(" ");
        for(int j=1;j<=i+count;j++)
          System.out.print("*");
        System.out.println();
        count++;
      }
	}
}