import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String s;
    s=sc.nextLine();
    int count=0;
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)==' ')
        count++;
    }
    String str[]=s.split(" ",count+1);
    int a[]=new int[count+1];
    for(int i=0;i<count+1;i++)
    {
      for(int j=i+1;j<count+1;j++){
      if(str[i].equals(str[j]))
        a[j]=-1;
        
     }
      if(a[i]!=-1)
      System.out.print(str[i]+" ");
    }
  }
}