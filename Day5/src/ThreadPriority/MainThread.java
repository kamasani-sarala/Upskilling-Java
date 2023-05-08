package ThreadPriority;

public class MainThread {
	public static void main(String[] args) {
		
        AThread at=new AThread();
        BThread bt=new BThread();
 
         at.setPriority(1);//MiN_PRIORITY(10)
         bt.setPriority(10);//MAN_PRIORITY(1)
         
        at.run();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        bt.run();
}
}

