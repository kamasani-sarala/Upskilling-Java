package ThreadState;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AThread a = new AThread ();
        BThread b = new BThread ();
        // Both the above threads are in runnable state
        // Running state of thread A & B
        a.start ();
        // Move control to another thread
        a.yield ();
        // Blocked State of thread B
        try
        {
            a.sleep (1000);
        } 
        catch (InterruptedException e)
        {
            e.printStackTrace ();
        }
        b.start ();
        System.out.println ("Main Thread End");
	}

}
