package multithreadexample;
public class ThreadClassDemo {

   @SuppressWarnings("static-access")
public static void main(String [] args) throws InterruptedException {
   
   System.out.println(Thread.activeCount());
   System.out.println(Thread.currentThread().getName());
   reversecounter thread2=new reversecounter();  // remember here we have reversecounter extends thread
   thread2.setName("Reverse Counter");

   forwardcounter fc=new forwardcounter();  // here we are implementing interface runnable hence we need to pass the instance of our class to java thread class
   								  // this is better way to do it as it allows us to extend any other class which we want
   								// by default any class can extend only one class
   Thread thread3=new Thread(fc);
   thread2.start();
   thread3.start();
 
     
   }
}