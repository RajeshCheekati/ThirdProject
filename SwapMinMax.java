public class SwapMinMax {
    public static void main(String[] args) {
        int[] array = {3, 1, 9, 7, 5, 2, 6, 8, 4};

        // Print original array
        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Check if the array is too small to need swapping
        if (array.length >= 2) {
            int minIndex = 0;
            int maxIndex = 0;

            // Find indices of min and max values
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
                if (array[i] > array[maxIndex]) {
                    maxIndex = i;
                }
            }

            // Swap min and max values
            int temp = array[minIndex];
            array[minIndex] = array[maxIndex];
            array[maxIndex] = temp;
        }

        // Print array after swapping
        System.out.println("Array after swapping min and max values:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
