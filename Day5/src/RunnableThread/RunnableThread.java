package RunnableThread;

public class RunnableThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Runnable at=new AThread();
   Runnable bt=new BThread();
   
   Thread t1=new Thread(at);
   Thread t2=new Thread(bt);
   
   t1.start();
   t2.start();
	}

}
