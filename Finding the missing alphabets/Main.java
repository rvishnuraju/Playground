import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner sc=new Scanner(System.in);
      String s=new String(sc.nextLine());
      s=s.toLowerCase();
      int a[]=new int[26];
      for(int i=0;i<s.length();i++)
      {
        if(s.charAt(i)!=' ')
        a[s.charAt(i)-'a']=1;
      }
      for(int i=0;i<26;i++)
      {
        if(a[i]==0)
          System.out.print((char)(i+'a')+" ");
      }
    }
}