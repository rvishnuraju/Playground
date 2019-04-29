import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String v="aeiouAEIOU";
    for(int i=0;i<s.length();i++)
    {
      if(v.contains(s.substring(i,i+1)))
      {
      }
      else
        System.out.print(s.substring(i,i+1));
    }
  }
}