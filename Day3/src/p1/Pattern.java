package p1;

public class Pattern {
	
	public static void main(String args[])   
	{   
		int column=5;  
		for (int i= 0; i<= column-1; i++)  
		{  
		for (int j=0; j<=i; j++)  
		{  
		System.out.print(" ");  
		}  
		for (int k=0; k<=column-1-i; k++)  
		{  
		System.out.print("*" + " ");  
		}  
		System.out.println();  
		}  
		}  
		}  
