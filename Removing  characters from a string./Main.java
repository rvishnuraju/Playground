import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    StringBuilder s1=new StringBuilder(sc.nextLine());
    StringBuilder s2=new StringBuilder(sc.nextLine());
    for(int i=0;i<s2.length();i++)
    {
      for(int j=0;j<s1.length();j++)
      {
        if(s2.charAt(i)==s1.charAt(j))
          s1.replace(j,j+1,"");
      }
    }
    System.out.print(s1);
    
  }
}