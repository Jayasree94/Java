import java.util.*;
public class SetDemo
{
    public static void main(String args[])
    {
        Set set = new HashSet();
        set.add("Rohan");
        set.add("kaveri");
        set.add("mohan");
        System.out.println("Retrieving values from HashSet using Iterator");
        retrieveValuesFromListMethod1(set);
    }
    public static void retrieveValuesFromListMethod1(Set set)
    {
        Iterator itr = set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}