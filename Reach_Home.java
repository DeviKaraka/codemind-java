import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int x,y;
        Scanner read=new Scanner(System.in);
        x=read.nextInt();
        y=read.nextInt();
        if(x*5>=y)
        {
            System.out.printf("YES");
        }
        else
        {
            System.out.printf("NO");
        }
    }
}