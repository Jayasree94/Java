import java.util.*;
public class StringPalindrome
{
   public static void main(String args[])
   {
       Scanner s=new Scanner(System.in);
       String str=s.next();
       int n=str.length();
       String rev="";
       for(int i=n-1;i>=0;i--)
       {
           rev=rev+str.charAt(i);
           
       }
       if(str.equals(rev))
       {
           System.out.println(str+"  is Palindrome");
        }
        else
        {
        System.out.println(str+"  is Not a palindrome");
        }
   }
}