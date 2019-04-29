import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc=new Scanner(System.in);
    String s=new String(sc.nextLine());
    int n=sc.nextInt();
    if(s.charAt(0)=='N')
      System.out.print("I am waiting");
    else
      System.out.print("All is well");
  }
}