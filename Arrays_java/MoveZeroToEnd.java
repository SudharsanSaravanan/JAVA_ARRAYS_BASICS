package arrays;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int num[] = {1,2,3,3,0,3,2,0,0,1,6,4,0};
        int zero[] = new int[num.length];
        int new_num[] = new int[num.length];
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<num.length;i++){
            if(num[i] == 0){
                zero[count1] = num[i];
                count1++;
            }
            else{
                new_num[count2] = num[i];
                count2++;
            }
        }
        System.out.println(Arrays.toString(new_num));
    }
}
