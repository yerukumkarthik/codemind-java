import java.util.*;
public class Frames{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int a=read.nextInt();
        int b=read.nextInt();
        float c=(float)((b-a)*100)/a;
        System.out.printf("%.2f",c);
    }
}