package arrays;
import java.util.Scanner;
public class array_inputing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int[] numbers = new int[n];
        
        for(int i = 0;i<n;i++){
            System.out.print("Enter the element at index "+i+": ");
            numbers[i] = in.nextInt();
        }
        
        for(int i = 0;i<n;i++){
            System.out.println(numbers[i]);
        }
        in.close();
                          
    }
}
