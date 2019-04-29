import java.util.*;
public class Main{
    public static void main(String args[]) {
        // Type your code her
      Scanner sc=new Scanner(System.in);
      char ch=sc.next().charAt(0);
     int n=sc. nextInt() ;
      
      ch=(char) (ch-n);
      if(ch>='a'||ch=='R'  )
      System.out.println(ch);
      else
      System.out.println((char) (ch+26)) ;  
      
    }
}