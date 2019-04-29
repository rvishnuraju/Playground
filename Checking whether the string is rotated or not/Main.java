import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc=new Scanner(System.in);
      String s=new String(sc.nextLine());
      String s2=new String(sc.nextLine());
      s=s.concat(s);
      if(s.contains(s2))
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}