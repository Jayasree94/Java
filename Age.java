import java.util.*;
public class Age
{
    public static void main(String args[])
    {
       int flag=0;
        String name=args[0];
        try
        {
         int age=Integer.parseInt(args[1]);
         
         if(age>=18&&age<60)
         {
             System.out.println(name+"age is "+age);
         }
         else
            throw new UserDefinedException();
        
        }
             
        catch(ArrayIndexOutOfBoundsException e)
        {
            flag=1;
            System.out.println("Exception:"+ e);
        }
        catch(NumberFormatException e)
        {
            flag=1;
            System.out.println("Exception:"+ e);
        }
        catch(UserDefinedException e)
        {
            flag=1;
            System.out.println("Exception:"+ e);
        }
        if(flag==0)
        {
            System.out.println("everything is fine");
        }
    }
}
class UserDefinedException extends Exception
{
    public UserDefinedException()
    {
        System.out.println("User defined exception thrown");
    }
    public String toString()
    {
        return "Age cannot be less than 18 and greater than 60";
    }
}