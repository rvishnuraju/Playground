import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner sc=new Scanner(System.in);
      String s=new String(sc.nextLine());
      String s1=new String(sc.nextLine());
      String r=new String(sc.nextLine());
      System.out.print(s.replaceFirst(s1,r));
        
    }
}