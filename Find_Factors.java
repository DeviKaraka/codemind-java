import java.util.Scanner;
public class Main{
    public static void main(String[] args){
       int i,n;
       Scanner read=new Scanner(System.in);
       n=read.nextInt();
       for(i=1;i<=n;i++)
       {
           if(n%i==0)
           {
               System.out.printf("%d ",i);
           }
       }
       //System.out.printf("%d",res);
    }
}