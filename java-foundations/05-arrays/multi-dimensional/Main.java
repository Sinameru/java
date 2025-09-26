public class Main {
    public static void main(String[] args) {

        // Declare and initialize a 2D array (matrix)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Access elements
        System.out.printf("Element at row 1, col 2: %d\n", matrix[0][1]);

        // Modify elements
        matrix[2][0] = 10;
        System.out.printf("Updated element at row 3, col 1: %d\n", matrix[2][0]);

        // Dimensions of the matrix
        System.out.printf("Number of rows: %d\n", matrix.length);
        System.out.printf("Number of columns in first row: %d\n", matrix[0].length);
    }
}
