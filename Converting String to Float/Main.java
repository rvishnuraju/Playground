import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    double n=0;
    int dcount=0;
    int pointer=0;
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)!='.')
      {
        n=n*10+(s.charAt(i)-'0');
        if(pointer==1)
          dcount++;
      }
      else
        pointer=1;
    }
    n=n/Math.pow(10,dcount);
    System.out.printf("%.6f",n);
  }
}