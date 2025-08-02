package neww;

public class d2_array{
    public static void main(String[] args) {
        
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

       
        int[][] result = new int[A.length][B[0].length];

     
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }


        System.out.println("Matrix A:");
        printMatrix(A);


        System.out.println("Matrix B:");
        printMatrix(B);


        System.out.println("Resultant Matrix (A x B):");
        printMatrix(result);
    }


    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
