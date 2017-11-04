


import java.util.Scanner;



public class Timer {

    
    
    public static void main(String[] args)
    {
        
       
        
        long count1=0;
        long starttime = System.nanoTime();  // the timer starts
        long sum = 0L;   
        for(long i=0;i<=Integer.MAX_VALUE;i++)
        {
             count1++;
            sum = sum +i;
           
            
        }
        System.out.println("The sum is:"+sum);
        long endtime = System.nanoTime();  //endtime
        
        
        long duration = endtime - starttime;
        System.out.println("time/ns:"+duration);
        
       double duration_sec = (double)duration/1000000000.0;
       System.out.println("time/sec:"+duration_sec);
       
       System.out.println("the calculation per nanosecond:"+Math.round(duration*1000000d/count1)/1000000d);
        
        
      
      
        
        System.out.println("-----------second program--------------------");    
      
      
      
      
        long sum1=0L;
        long t = 0;
        int count =0;
        System.out.print("please give me time in nanosececonds:");
        
     try
    {    
        Scanner in = new Scanner(System.in);
        t= in.nextLong();
        
       
           
        long starttime1 = System.nanoTime();   
        for(long j=0;j<=Integer.MAX_VALUE;j++)
        {
            
           
            if(System.nanoTime()-starttime1>=t) //if pass the time we have given then break...stop counting
            {
                break;
            }
            sum1 = sum1 +j;
            count++;
            
        }
     }
    catch(Exception e)
        {
            System.out.println("wrong input");
            System.exit(0);
        }
    
    
        System.out.println("The sum is:"+sum1);
       
        
        System.out.println("The number of numerical operations is:"+count);
        
    }
}    
        
       
        
        
        
       
        
   
   
   
        
    
  
