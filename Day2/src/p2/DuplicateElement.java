package p2;

import java.util.Scanner;

public class DuplicateElement {
	 public static void main(String[] args) {      
         
	        //Input the number of elements in the array.  
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the size of array");
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        //Input the elements of the array.
	        System.out.println("Enter the elements of array");
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }  //end of for loop  
	        System.out.println("Duplicate elements are: ");  
	        //Search for duplicate element  
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);  
	            }  
	        }
	 }
}

