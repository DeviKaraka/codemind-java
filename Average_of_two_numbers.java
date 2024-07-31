import java.util.Scanner;
public class Division{
    public static void main(String[] args)
    {
        int a,b;
        double c;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        c=(a+b)/2.0;
        //System.out.println("Average of "+ a +" and "+b+" is " +": " +c );
        System.out.printf("Average of %d and %d is: %.2f",a,b,c);
    }
}