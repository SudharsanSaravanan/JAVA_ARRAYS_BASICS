package arrays;

import java.util.Scanner;

public class searching_element {
    public static void main(String[] args) {
        int[]  numbers = {1,2,3,4,5,6,7,8};
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = in.nextInt();
        for(int i=0;i<numbers.length;i++){
            if (numbers[i] == num) {
                System.out.println("The number is present in the array!!");
            }
        }
        in.close();
    }
    
}
