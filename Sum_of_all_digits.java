import java.util.Scanner;
public class Main{
    public static void main(String[] args){
       int i,n;
       Scanner read=new Scanner(System.in);
       n=read.nextInt();
       int s=0;
       while(n!=0)
       {
             int d=n%10;
             s=s+d;
             n=n/10;
       }
       System.out.printf("%d",s);
    }
}