import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a;
      int max=0,count=0;
      for(int i=0;i<n;i++)
      {
        a=sc.nextInt();
        if(a==1)
          count++;
        else
          count=0;
        if(max<count)
          max=count;
      }
      System.out.print(max);
    }
}