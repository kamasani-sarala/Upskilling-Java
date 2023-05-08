package DividedByZero;

import java.util.Scanner;

public class DividedByZero {
	 public static void main (String args[]) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the first number:");
		 int num1 =sc.nextInt();
		 System.out.println("Enter the second number");
		 int num2 =sc.nextInt();
		 int result = 0;
	   //   int num1 = 10, num2 = 0, result = 0;
	      try{
	          result = num1/num2;
	          System.out.println("The result is" +result);
	      } 
	      catch (ArithmeticException e) {
	         System.out.println ("Can't be divided by Zero " + e);
	      }
	   }
}
