package arrays;

public class RecursiveSumOfNumbers {
    public static int sumArray(int[] arr, int index) {
        // Base case: if index reaches the end of the array, return 0
        if (index == arr.length) {
            return 0;
        }
        // Recursive case: return current element + sum of the rest of the array
        return arr[index] + sumArray(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example array
        int result = sumArray(arr, 0);
        System.out.println("Sum of numbers in the array is: " + result);
    }
}