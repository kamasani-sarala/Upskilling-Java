package p1;

public class JoinThread extends Thread {
	public void run()  
    {    
        for(int i=1; i<=4; i++)  
        {    
            try  
            {    
                Thread.sleep(1000);    
            }catch(Exception e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {   
        // creating three threads  
        JoinThread t1 = new JoinThread();    
        JoinThread t2 = new JoinThread();   
        // thread t1 starts  
        t1.start();   
        // starts second thread when first thread t1 is died.  
        try  
        {    
            t1.join();    
        }catch(Exception e){System.out.println(e);}    
        // start t2    
        t2.start();   
           
    }    
}  

