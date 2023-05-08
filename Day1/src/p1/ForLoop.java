package p1;

import java.util.Scanner;

public class ForLoop {
public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number = ");
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			
			System.out.println(i);
			
		}
	}
}
