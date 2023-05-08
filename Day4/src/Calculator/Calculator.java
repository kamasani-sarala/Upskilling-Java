package Calculator;

import java.util.Scanner;
enum cal{
	Addition,Substraction,Multiplication,Division;
}

public class Calculator {
	
	    public static void main(String[] args) {

	    	int num1, num2;
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter first number:");
           cal c =cal.Multiplication;
	        /* We are using data type double so that user
	         * can enter integer as well as floating point
	         * value
	         */
	        num1 = scanner.nextInt();
	        System.out.print("Enter second number:");
	        num2 = scanner.nextInt();

	        //System.out.print("Enter an operator (+, -, *, /): ");
	        //char operator = scanner.next().charAt(0);

	        scanner.close();
	        int output;

	        switch(c)
	        {
	            case Addition:
	            	output = num1 + num2;
	                break;

	            case Substraction:
	            	output = num1 - num2;
	                break;

	            case Multiplication:
	            	output = num1 * num2;
	                break;

	            case Division:
	            	output = num1 / num2;
	                break;

	           
	            default:
	                System.out.printf("Error");
	                return;
	        }

	        System.out.println(num1+" "+c+" "+num2+": "+output);
	    }
	}


