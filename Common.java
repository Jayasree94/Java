public class Common
{
    static double a[]=new double[5];
    public static void main(String args[])
    {
        try
        {
            for(int i=0;i<5;i++)
            a[i]=Math.random();
            Test1 test=new Test1();
            Test2 ts=new Test2();
                new Thread(ts).start();
            new Thread(test).start();
        
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
class Test1 implements Runnable
{
    public void run()
    {
        for(int i=0;i<Common.a.length;i++)
        {
            System.out.println(Common.a[i]);
        }
    }
    
}
class Test2 implements Runnable
{
    public void run()
    {
        int f=1;
        for(int j=0;j<Common.a.length;j++)
        {
            for(int i=1;i<Common.a[j];i++)
            {
                f=f*i;
            }
            System.out.println("factorial of number is:"+f);
            f=1;
        }
    }
}