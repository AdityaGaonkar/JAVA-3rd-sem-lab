import java.util.Scanner;

 class matrix_mult{
     int row, col;

     matrix_mult(int r, int c) {
         row = r;
         col = c;
     }

     void printMatrix(int[][] arr) {
         for (int i = 0; i < row; i++) {
             for (int j = 0; j < col; j++) {
                 System.out.printf(arr[i][j] + " ");
             }
             System.out.println();
         }
         System.out.println();
     }

     void productmatrix(int[][] matrix1, int[][] matrix2, int col1) {
         int[][] matrix = new int[row][col];
         for (int i = 0; i < row; i++) {
             for (int j = 0; j < col; j++) {
                 matrix[i][j] = 0;
                 for (int k = 0; k < col1; k++) {
                     matrix[i][j] += (matrix1[i][k] * matrix2[k][j]);
                 }
             }
         }
         System.out.println("product is");
         printMatrix(matrix);
     }

 }
 public class matrix_multt{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and columns of matrix 1");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        matrix_mult mm = new matrix_mult(row1, col1);
        int[][] matrix1 = new int[row1][col1];
        System.out.println("enter the elements");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        mm.printMatrix(matrix1);
        System.out.println("enter the rows and columns of second matrix");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int[][] matrix2 = new int[row2][col2];
        System.out.println("enter the elements");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        matrix_mult mm2=new matrix_mult(row2,col2);
        mm2.printMatrix(matrix2);
        matrix_mult mm3=new matrix_mult(row1,col2);
        mm3.productmatrix(matrix1, matrix2, col1);
    }
 }


