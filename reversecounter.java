package multithreadexample;
public class reversecounter extends Thread {
   
   public reversecounter() {
      
   }
   @Override
   public void run() {
      for (int i=10;i>0;i--)
      {
	  System.out.println("Thread Reverse Counter -->"+"   "+i);
	  try {
	    Thread.sleep(1000);
	    
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
      }
      
      System.out.println("Exiting thread Reverse Counter");
      
   }
}