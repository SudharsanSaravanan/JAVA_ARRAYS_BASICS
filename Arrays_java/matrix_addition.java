package two_d_array;

import java.util.Scanner;

public class matrix_addition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter no. of columns: ");
        int cols = in.nextInt();

        int matrix1[][] = new int[rows][cols];
        int matrix2[][] = new int[rows][cols];


        for(int i = 0;i<rows;i++){
            System.out.println("enter the elements of row (mat1) "+(i+1));
            for(int j = 0;j<cols;j++){
                matrix1[i][j] = in.nextInt();
            }
        }
        for(int i = 0;i<rows;i++){
            System.out.println("enter the elements of row (mat2) "+(i+1));
            for(int j = 0;j<cols;j++){
                matrix2[i][j] = in.nextInt();
            }
        }

        int sum_matrix[][] = new int[rows][cols];
        System.out.println("the sum of matrices");
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                sum_matrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum_matrix[i][j]+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
