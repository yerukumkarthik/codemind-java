import java.util.*;
public class Hyp{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        int m=read.nextInt();
        double ans=Math.sqrt(n*n+m*m);
        System.out.printf("%.2f",ans);
    }
}