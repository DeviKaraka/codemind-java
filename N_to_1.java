import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int n,i;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        for(i=n;i>=1;i=i-1)
        {
            System.out.printf("%d ",i);
        }
    }
    
}