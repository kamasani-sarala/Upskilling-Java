package p1;

import java.util.Scanner;

public class SumOfNum {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        int sum = 0;
        int i = 1;

        do {
            sum += i; 
            i++; 
        } while (i <= n);

        System.out.print("The sum of numbers from 1 to " + n + " is: " + sum);
    }


}

