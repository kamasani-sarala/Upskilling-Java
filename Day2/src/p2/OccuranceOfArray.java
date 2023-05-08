package p2;

import java.util.Scanner;

public class OccuranceOfArray {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size and elements from user input
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Get integer to search from user input
        System.out.print("Enter the integer to search: ");
        int searchInt = scanner.nextInt();

        // Count the occurrence of integer in the array
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == searchInt) {
                count++;
            }
        }
        // Print the occurrence count
        System.out.println("The integer " + searchInt + " occurs " + count + " times in the array.");
  
	}
}
