import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n = sc.nextInt();
      int fact=1;
      for(int i=2;i<=n;i++)
      {
        fact*=i;
      }
      System.out.println(fact);
	}
}