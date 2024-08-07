import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int n,a,b,i;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        a=read.nextInt();
        b=read.nextInt();
        for(i=a;i<=b;i++)
        {
            System.out.printf("%d x %d = %d
",n,i,i*n);
        }
    }
}