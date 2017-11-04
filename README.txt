# Timer
The purpose is to measure how fast a computer is

How long a computer wants to do some "time to consume" action/calculation.     
(sum:for(long i=0;i<=Integer.MAX_VALUE;i++))
But also the opposite, that is to try to measure how many operations/calculations  
a computer can do at a certain time


Remarks:
1.When running the program, time varies
  time for a few ms. Which we can not understand
  The reason is that other processes are being carried out
2.In this program, we give the time we want to perform
  acts and brings us the sum and the number of acts
  However, if we give the same time as the previous runtime
  we see that the sum is smaller because it performs extra
  Act-condition if (System.nanoTime () - starttime1> = t) ie check time
  execution is over the time we entered to stop counting
  Clearly, he wants more time.
  Also if we import time beyond the boundaries or characters try-catch




