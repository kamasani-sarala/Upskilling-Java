package ThreadState;

public class BThread extends Thread{
	public void run ()
    {
        System.out.println ("Thread B");
        for (int i = 1; i <= 5; i++)
        {
            System.out.println ("i = " + i);
        }
        System.out.println ("Thread B Completed.");
    }

}
