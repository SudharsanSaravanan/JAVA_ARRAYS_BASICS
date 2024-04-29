package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int num[] = {2,3,5,11,9,7};
        int rev_num[] = new int[num.length];
        int count=0;
        for(int i=(num.length-1);i>=0;i--){
            rev_num[count] = num[i];
            count++;
        }
        System.out.println("REVERSED ARRAY: "+  Arrays.toString(rev_num));
    }
}
