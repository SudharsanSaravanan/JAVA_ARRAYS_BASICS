package arrays;

public class FrequencyOfNumber {
    public static void main(String[] args) {
        int num[] = {1,1,1,2,2,3,2,4,4,4,4,4};
        int num_freq = 2;
        int count = 0;
        
        for(int i=0;i<num.length;i++){
            if(num[i] == num_freq){
                count++;
            }
        }
        System.out.println("Frequency of number:"+ count);
    }
}
