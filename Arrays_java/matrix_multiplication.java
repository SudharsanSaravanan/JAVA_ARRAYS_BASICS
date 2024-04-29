package two_d_array;

import java.util.Scanner;

public class matrix_multiplication {
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

        int product_matrix[][] = new int[rows][cols];
        System.out.println("the sum of matrices");
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                for(int k = 0;k<rows;k++){
                    product_matrix[i][j] += matrix1[i][k] + matrix1[k][j];
                }
                System.out.print(product_matrix[i][j]+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
