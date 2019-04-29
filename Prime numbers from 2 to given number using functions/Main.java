import java.util.Scanner;
class Main{
    public static void prime(int n)
    {
      for(int i=2;i<=n/2;i++)
      {
        if(n%i==0)
          return;
      }
      System.out.println(n);
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=2;i<=n;i++)
      {
        prime(i);
      }
	}
}