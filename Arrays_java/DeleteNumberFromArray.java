package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteNumberFromArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num[] = {1,2,3,4,5,6,7,8,9};
        int del_array[] = new int[num.length];
        int new_array[] = new int[num.length];
        System.out.print("Enter a number: ");
        int del_num = in.nextInt();
        int count = 0;

        for(int i=0;i<num.length;i++){
            if (num[i] == del_num) {
                del_array[0] = num[i];
            }
            else{
                new_array[count] = num[i];
                count++;
            }
        }
        new_array = Arrays.copyOf(new_array, count);

        for(int i=0;i<new_array.length;i++){
            System.out.print(new_array[i]+" ");
        }
        in.close();
    }
}
