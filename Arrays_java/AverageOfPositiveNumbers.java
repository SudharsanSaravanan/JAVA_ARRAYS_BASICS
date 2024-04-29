package arrays;

public class AverageOfPositiveNumbers {

	public static void main(String[] args) {
		
		int num[] = {1,2,3,-2,3,-4,0};
		double sum = 0,count = 0;
		for(int i = 0;i<num.length;i++) {
			if(num[i]>=0) {
				sum += num[i];
				count++;
			}
		}
		double avg = sum/count;
		System.out.println(avg);
	
	}
}
