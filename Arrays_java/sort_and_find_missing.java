package arrays;
import java.util.*;


public class sort_and_find_missing {
  public static void main(String[] args) {
     //Input array
    int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
    
    // Rearranging the array
    rearrangeArray(arr);
    
    // Printing the rearranged array
    System.out.println(Arrays.toString(arr));
}

public static void rearrangeArray(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n; i++) {
        // If element is present and not equal to its index
        // or element is out of bounds of the array
        if (arr[i] != -1 && arr[i] != i) {
            int x = arr[i];

            // Check if the desired position is within bounds
            while (arr[x] != -1 && arr[x] != x) {
                int y = arr[x];
                arr[x] = x;
                x = y;
            }

            arr[x] = x;

            // If the original element at position i was -1
            // or it's now in its correct position
            if (arr[i] != -1) {
                arr[i] = x;
            }
        }
    }

    // Fill remaining positions with -1
    for (int i = 0; i < n; i++) {
        if (arr[i] != i) {
            arr[i] = -1;
        }
    }
  }
}

