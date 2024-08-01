import java.util.Scanner;
public class Number{
    public static void main(String[] args)
    {
        int a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        int c=(a*b)/(a+b);
        System.out.println(c);
    }
}