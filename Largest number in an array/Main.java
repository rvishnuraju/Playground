import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int a[]=new int[size];
      a[0]=sc.nextInt();
      int max=a[0];
      for(int i=1;i<size;i++)
      {
        a[i]=sc.nextInt();
        if(a[i]>max)
          max=a[i];
      }
      System.out.println(max);
    }
}