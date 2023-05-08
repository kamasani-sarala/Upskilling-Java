package p1;

import java.util.Scanner;

public class UsingScanner {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first value");
	int num1 =sc.nextInt();
	System.out.println("Enter second value");
	int num2=sc.nextInt();
	int sum=num1+num2;
	System.out.println("Sum of a and b is:"+sum);
}
}
