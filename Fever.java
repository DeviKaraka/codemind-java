import java.util.Scanner;
public class Mean{
    public static void main(String[] args)
    {
        int x;
        Scanner read=new Scanner(System.in);
        x=read.nextInt();
        if(x>=100)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}