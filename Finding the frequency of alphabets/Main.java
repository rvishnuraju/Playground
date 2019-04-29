import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      String s=new String();
      Scanner sc=new Scanner(System.in);
      s=sc.nextLine();
      s=s.toLowerCase();
      int a[]=new int[26];
      for(int i=0;i<s.length();i++)
      {
        a[s.charAt(i)-'a']++;
      }
      for(int i=0;i<s.length();i++)
      {
        if(a[s.charAt(i)-'a']>0)
        {
          System.out.print(s.charAt(i)+""+a[s.charAt(i)-'a']+" ");
          a[s.charAt(i)-'a']=0;
        }
      }
    }
}