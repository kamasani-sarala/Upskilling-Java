package p2;

public class TwoSortedArrays {
	public static void main(String[] args) {
		int[] arr1 = {1, 3, 4, 6, 7, 9};
		int[] arr2 = {1, 2, 4, 5, 9, 10};
		 int i = 0, j = 0;
		 while (i < arr1.length && j < arr2.length) {
	 if (arr1[i] == arr2[j]) {
		 System.out.print(arr1[i] + " ");
		 i++;
		j++;
		 } 
	 else if (arr1[i] < arr2[j]) {
		 i++;
		} 
		 else{
		 j++;
		 }
		 }
	}
}