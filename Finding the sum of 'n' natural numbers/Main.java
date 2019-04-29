import java.util.Scanner;
class Main {
    public static int add(int n,int res)
    {
      if(n==0)
        return res;
      else
        return add(n-1,res+n);
    }
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int res=0;
      System.out.print(add(n,res));
    }
}