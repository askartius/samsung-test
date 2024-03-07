public class SuperSorter {
    public static void bubbleSort(int[] array) {
        for (int iter = 0; iter < array.length; iter++) {
            for (int pos = 1; pos < array.length - iter; pos++) {
                if (array[pos] < array[pos - 1]) {
                    // Switching the neighbouring values
                    array[pos - 1] += array[pos];
                    array[pos] = array[pos - 1] - array[pos];
                    array[pos - 1] -= array[pos];
                }
            }
        }
    }

    public static void insertionSort(int[] array) {
        for (int iter = 1; iter < array.length; iter++) {
            int pos = iter - 1;
            int value = array[iter];

            while (pos >= 0 && value < array[pos]) {
                array[pos + 1] = array[pos]; // Moving bigger items to the back
                pos--;
            }
            array[pos + 1] = value;
        }
    }
}