import java.util.Scanner;
class Main{
  public static int great(int a,int b)
  {
    if(a>b)
      return a;
    else
      return b;
  }
	public static void main (String[] args){
	    // Type your code here
      int a,b,c;
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      System.out.println(great(great(a,b),c));
      
	}
}