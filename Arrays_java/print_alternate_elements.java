package arrays;

public class print_alternate_elements {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8};
        for(int i = 0; i< numbers.length;i += 2){
            System.out.print(numbers[i]+" ");
        }
    }
}
