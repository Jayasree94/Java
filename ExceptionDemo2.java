public class ExceptionDemo2
{
   public static void main(String args[])
   {
       int sum=0;
      try{
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
            sum=sum+Integer.parseInt(args[i]);
        }
        System.out.println("The average of marks is "+sum/5);
      }
      catch(ArrayIndexOutOfBoundsException e){
         System.out.println ("ArrayIndexOutOfBoundsException");
      }
   }
}