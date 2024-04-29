package arrays;

public class sum_and_avg {
    public static void main(String[] args) {
        int[] numbers = {2,3,4,5,6,1};
        double sum = 0;
        System.out.println(numbers.length);
        for(int i = 0; i< numbers.length;i++){
            sum += numbers[i];
        }
        double avg = sum / numbers.length;
        System.out.println("Sum of array elements: "+ sum);
        System.out.println("Average of of array elements: "+ avg);
    }
}
