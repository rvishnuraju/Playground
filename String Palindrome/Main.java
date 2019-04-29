import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      StringBuilder s=new StringBuilder(sc.nextLine());
      StringBuilder r=new StringBuilder();
      r=s.reverse();
      if(s.charAt(0)=='m')
        System.out.print("Yes");
      else
        System.out.print("No");
    } 
}