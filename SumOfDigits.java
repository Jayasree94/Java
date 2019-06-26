import java.util.*;
public class SumOfDigits
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
       int n=scan.nextInt();
       int a[]=new int[4];
       int sum=0;
       for(int i=0;i<4;i++)
       {
           a[i]=n%10;
           sum=sum+a[i];
           n=n/10;
       }
       System.out.println("The sum of digits entered is:"+sum);
    }
    
}