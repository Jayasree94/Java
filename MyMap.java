import java.util.Map; 
import java.util.HashMap; 
  
public class MyMap
{ 
Map< String,Integer> addPhoneNum = new HashMap<String,Integer>(); 
public void addPhoneNum( String name,Integer phonenumber) 
{ 
    addPhoneNum.put(name,phonenumber); 
} 
public Integer getPhnNum(String name)
{ 
    return addPhoneNum.get(name); 
} 
public static void main(String[] args)
{ 
    Map_example m1 = new Map_example(); 
    m1.addPhoneNum("vinay",99115); 
    System.out.println(m1.getPhnNum("Vinay")); 
} 
}