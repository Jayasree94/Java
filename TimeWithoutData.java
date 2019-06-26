import java.text.SimpleDateFormat;
import java.util.Date;
 import java.util.*;
import java.util.concurrent.TimeUnit;
//package com.concretepage;
public class TimeWithoutData extends Thread
{
  public static final long CURRENT_TIME_MILLIS = System.currentTimeMillis();
  public static void main( String[] args ) throws InterruptedException{
     // Convert the milliseconds since the epoch into a
     
             try{
     for(int i=0;i<10;i++){
        TimeUnit.SECONDS.sleep(2);
     Date instant = new Date(CURRENT_TIME_MILLIS);
     SimpleDateFormat sdf = new SimpleDateFormat( "HH:mm:ss" );
     String time = sdf.format( instant );
     System.out.println( "Time: " + time );
     Thread.sleep(2000);
         }
         
             }
             catch(InterruptedException e)
             {
                 System.out.println("Exception");
             }
   
  }
}