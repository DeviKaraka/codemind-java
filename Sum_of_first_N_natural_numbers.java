import java.util.Scanner;
public class Number{
    public static void main(String[] args)
    {
        int n;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        int b=(n*(n+1))/2;
        System.out.println(b);
    }
}