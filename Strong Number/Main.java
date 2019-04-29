import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int temp=n;
      int sum=0;
      while(n>0)
      {
        int fact=1;
        for(int i=2;i<=n%10;i++)
          fact*=i;
        sum+=fact;
        n/=10;
      }
      if(sum==temp)
        System.out.println("Yes");
      else 
        System.out.println("No");
	}
}