import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc=new Scanner(System.in);
    int count=0;
    String s=new String();
    s=sc.nextLine();
    String sub=new String();
    sub=sc.nextLine();
    int len=sub.length();
    for(int i=0;i<s.length()-(len-1);i++)
    {
     if(sub.equals(s.substring(i,i+len)))
        count++;
    }
    System.out.print(count);
  } 
}