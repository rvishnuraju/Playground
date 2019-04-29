import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    StringBuilder s=new StringBuilder("");
    char c=' ';
    if(n<0){
      n*=-1;
       c='-';
    }
    while(n>0)
    {
      s.append((n%10));
      n/=10;
      if(c!=' '&&n==0)
      s.append(c);
    }
    System.out.print(s.reverse());
  }
}