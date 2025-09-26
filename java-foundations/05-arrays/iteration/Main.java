public class Main {
    public static void main(String[] args) {
 
        // One-dimensional array iteration
        int[] numbers = {10, 20, 30};

        System.out.println("Iterating 1D array with standard for-loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Index %d: %d\n", i, numbers[i]);
        }

        System.out.println("\nIterating 1D array with enhanced for-loop:");
        for (int num : numbers) {
            System.out.printf("Value: %d\n", num);
        }

        //  Two-dimensional array iteration
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };

        System.out.println("\nIterating 2D array with nested loops:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println("*"); // new line after each row
        }
    }
}

