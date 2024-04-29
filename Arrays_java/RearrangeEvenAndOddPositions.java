package arrays;

import java.util.Arrays;

public class RearrangeEvenAndOddPositions {
    public static void main(String[] args) {
       int arr[] = {1, 2, 3, 4, 5, 6, 7};
       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
       int length1,length2;
       if(arr.length % 2 == 0){
        length1 = (arr.length)/2;
        length2 = (arr.length)/2;
       }
       else{
        length1 = ((arr.length)/2)+1;
        length2 = ((arr.length)/2) ;
       }
       int arr1[] = new int[length1];
       int arr2[] = new int[length2];
       int count1 = 0,count2 = 0;
       for(int i = 0;i<length1;i++){
        arr1[count1] = arr[i];
        count1++;
       }
       for(int i = length1;i<arr.length;i++){
        arr2[count2] = arr[i];
        count2++;
       }
       int c1=0;

       for(int i =(arr1.length-1);i>=0;i--){
        arr1[c1] = arr[i];
        c1++;
       }

       int new_arr[] = new int[arr.length];
       int c2 = 0,c3 = 1;
       for(int i = 0;i<arr1.length;i++){
        new_arr[c2] = arr1[i];
        c2 += 2;
       }
       for(int i = 0;i<arr2.length;i++){
        new_arr[c3] = arr2[i];
        c3 += 2;
       }

       System.out.println(Arrays.toString(new_arr));
    }
}
