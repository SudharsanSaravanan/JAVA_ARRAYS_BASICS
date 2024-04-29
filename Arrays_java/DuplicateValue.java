package arrays;

import java.util.Arrays;

public class DuplicateValue {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 6, 3, 2, 4, 6, 7, 8, 5};
        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {
        Arrays.sort(arr); // Sort the array
        
        System.out.println("Duplicate elements in the array are:");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) { // Check if current element is equal to the previous one
                System.out.println(arr[i]);
            }
        }
    }
}

