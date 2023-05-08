package ThreadState;

public class AThread extends Thread{
	public void run ()
    {
        System.out.println ("Thread A");
        for (int i = 1; i <= 5; i++)
        {
            System.out.println ("i = " + i);
            try
            {
                Thread.sleep (1000);
            } 
            catch (InterruptedException e)
            {
                e.printStackTrace ();
            }
        }
        System.out.println ("Thread A Completed.");
    }
}
