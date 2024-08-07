import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int n;
        Scanner read=new Scanner(System.in);
         n=read.nextInt();
         int d=n%10;
         while(n>10)
             //int d=n%10;
             //count=count+1;
             n=n/10;
             d=d+n;
{
         System.out.printf("%d",d);
}
}
    
}