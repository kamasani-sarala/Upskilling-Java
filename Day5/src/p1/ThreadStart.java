package p1;

public class ThreadStart extends Thread {
   public void run() {
	System.out.println("Thrad is running.....");
	
}
   public static void main(String[] args) {
	   ThreadStart ts =new ThreadStart();
	   ts.run();
   }
}
