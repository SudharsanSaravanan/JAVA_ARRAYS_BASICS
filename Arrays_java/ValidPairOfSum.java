package arrays;
import java.util.Scanner;

public class ValidPairOfSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num[] = {0, -1, 2, -3, 1};
        System.out.print("Enter a number: ");
        int x = in.nextInt();
        int result = 0;
        for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i] + num[j] == x){
                    System.out.println("VALID PAIR: "+num[i]+"  "+num[j]);
                    result = num[i] +  num[j];               
                }    
            }
        }
        if(result==x){
            System.out.println("Valid pair exist!!");
        }
        else{
            System.out.println("Valid pair is absent *_*");
        }
        in.close();
    }
}
