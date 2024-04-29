package arrays;

import java.util.Arrays;

public class separate_even_odd {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8};
        int[] even_num = new int[numbers.length];
        int[] odd_num = new int[numbers.length];

        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i<numbers.length;i++){
            if(numbers[i]%2==0){
                even_num[count1] = numbers[i];
                count1++;
            }
            else{
                odd_num[count2] = numbers[i];
                count2++;
            }
        }

        even_num = Arrays.copyOf(even_num, count1);
        odd_num = Arrays.copyOf(odd_num, count2);
        
        System.out.println("Even numbers: " + Arrays.toString(even_num));
        System.out.println("Odd numbers: " + Arrays.toString(odd_num));
    }
}
