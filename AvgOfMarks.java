import java.util.*;
public class AvgOfMarks
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String stu1=s.next();
        String stu2=s.next();
        int cnt=0;
        int sum=0;
        int m1[]=new int[3];
        int m2[]=new int[3];
        try
        {
            for(int i=0;i<3;i++)
            {
                m1[i]=Integer.parseInt(args[i]);
                sum=sum+m1[i];
            }
            for(int i=3;i<6;i++)
            {
                m2[i]=Integer.parseInt(args[i]);
                cnt=cnt+m2[i];
            }
            System.out.println(stu1+" Average marks are:"+sum/3);
            System.out.println(stu2+" Average marks are:"+cnt/3);
            
        }
        catch(NumberFormatException e)
        {
            System.out.println("You have entered non integer value");
             System.out.println("This caused " + e);
        }
    }
}