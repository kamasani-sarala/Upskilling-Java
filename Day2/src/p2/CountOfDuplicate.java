package p2;

import java.util.Arrays;

public class CountOfDuplicate {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 3, 5, 6, 1, 7};

        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    // Move the elements to left if any duplicates found
                    for (int k = j; k < arr.length - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    arr = Arrays.copyOf(arr, arr.length - 1);
                    j--;
                }
            }
        }

        System.out.println("Total duplicates found: " + count);
        System.out.println("Array after removing duplicates: " + Arrays.toString(arr));
    }

}
