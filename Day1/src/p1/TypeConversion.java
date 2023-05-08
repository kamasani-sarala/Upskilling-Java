package p1;

public class TypeConversion {
	public static void main(String[] args) {

		int a=10;  
		String s=String.valueOf(a);
		System.out.println(s);
		String s1="70";  
		int b=Integer.parseInt(s1); 
		System.out.println(s1);
		double DoubleValue =2.77774;
	    int IntValue = (int) DoubleValue;
	 	System.out.println(IntValue);
	    String s2="23";  
	    double d=Double.parseDouble("23");  
	 	System.out.println(d);
	}
	}

