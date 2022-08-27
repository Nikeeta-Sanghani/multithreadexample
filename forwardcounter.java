package multithreadexample;

public class forwardcounter implements Runnable {
  
   
   public forwardcounter() {
      
   }
   
@Override
   public void run() {
      for (int i=0;i<11;i++)
      {
	 System.out.println("Thread Forward Counter -->"+"  "+i);
	 try {
	    Thread.sleep(2000);
	    
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
      }
	
      System.out.println("Exiting Thread Forward Counter");
         
      }


    
    

   }
