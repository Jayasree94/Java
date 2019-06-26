import java.util.*;
public class MinuteConversion
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int min=s.nextInt();
        int days,years;
        days=min/1440;
        years=days/365;
        System.out.println("The number of years and days are : "+years+" Years "+days+" Days");
    }
}