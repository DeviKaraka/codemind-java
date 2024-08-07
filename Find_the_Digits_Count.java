import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int n;
        Scanner read=new Scanner(System.in);
         n=read.nextInt();
         int count=0;
         int temp=1;
         while(n!=0)
         {
             int d=n%10;
             count=count+1;
             n=n/10;
         }
         System.out.printf("%d",count);
    }
}