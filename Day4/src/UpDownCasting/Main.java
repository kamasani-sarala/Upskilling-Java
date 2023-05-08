package UpDownCasting;

public class Main {
public static void main(String args[]) {
	A obj = (A)new B();//upcasting
	obj.show();
	
	B obj1 = (B) obj;//downcasting
	obj1.show1();
}
}
