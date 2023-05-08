package p2;

public class MultipleThreads extends Thread{
	public void run() {
		for(int i=1;i<=4;i++) {
		System.out.println("Thread One is running....");
	}
}
}
