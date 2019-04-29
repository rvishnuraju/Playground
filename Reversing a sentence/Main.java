import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      StringBuilder s=new StringBuilder(sc.nextLine());
      StringBuilder r=new StringBuilder();
       StringBuilder temp=new StringBuilder();
      r=s.reverse();
      for(int i=0;i<r.length();i++)
      {
       
        if(r.charAt(i)==' ')
        {
          System.out.print(temp.reverse()+" ");
          temp.setLength(0);
        }
        else
          temp.append(r.charAt(i));
        
      }
      System.out.print("I");
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        // Type your code here
      
    }
}