import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        int x,y;
        Scanner read=new Scanner(System.in);
        x=read.nextInt();
        y=read.nextInt();
        if(x<y)
        {
            System.out.println(y);
        }
        else
        {
            System.out.println(x);
        }
    }
}