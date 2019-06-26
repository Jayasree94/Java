import java.util.*;
public class Factorial
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int fact=1;
        System.out.println(fact(n));
       
    }
    public static int fact(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
}