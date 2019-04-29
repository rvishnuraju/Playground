import java.util.*;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;
      int count=0;
      int t=n;
      while(t>0)
      {
        count++;
        t/=10;
      }
      t=n;
      while(t>0)
      {
        sum+=Math.pow(t%10,count);
        t/=10;
      }
      if(sum==n)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}