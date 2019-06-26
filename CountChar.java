import java.util.*;
public class CountChar
{
    public static void main(String args[])
    {
        String str="Jayasreeaaa";
        char c='a';
        int m=str.length();
        int n=str.replace("a","").length();
        System.out.println("The number of occurances of given character are:"+(m-n));
    }
}