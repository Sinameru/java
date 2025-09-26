public class Main {
    public static void main(String[] args) {

        // Declare and initialize a 1D array
        int[] numbers = {10, 20, 30, 40, 50};

        // Access elements
        System.out.printf("First element: %d\n", numbers[0]);
        System.out.printf("Third element: %d\n", numbers[2]);

        // Modify elements
        numbers[1] = 25;
        System.out.printf("Updated second element: %d\n", numbers[1]);

        // Return number of elements in the array
        System.out.printf("Number of elements in the array: %d\n", numbers.length);

    }
}
