package arrays;

public class min_and_max_elements {
    public static void main(String[] args) {
        int[] myArray = {3, 1, 8, 4, 6, 2, 10};
        int min = myArray[0];
        int max = myArray[0];

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            } else if (myArray[i] > max) {
                max = myArray[i];
            }
        }

        System.out.println("Min element: " + min);
        System.out.println("Max element: " + max);
    }
}

