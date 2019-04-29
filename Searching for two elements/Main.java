import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc= new Scanner(System.in);
      int size=sc.nextInt();
      int a[]=new int[size];
      for(int i=0;i<size;i++)
        a[i]=sc.nextInt();
      int res1=-1,res2=-1;
      int s1=sc.nextInt();
      int s2=sc.nextInt();
      for(int i=0;i<size;i++)
      {
        if(a[i]==s1)
          res1=i;
        if(a[i]==s2)
          res2=i;
      }
      System.out.println(res1+"\n"+res2);
    }
}