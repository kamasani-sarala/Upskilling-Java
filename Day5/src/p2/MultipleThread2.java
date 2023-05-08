package p2;

public class MultipleThread2 extends Thread{
	public void run() {
		for(int i=1;i<=4;i++) {
		System.out.println("Thread two is running....");
	}
}
}
