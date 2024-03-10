public class SuperSorter {
    public static void bubbleSort(int[] array) {
        for (int iter = 0; iter < array.length; iter++) {
            for (int pos = 1; pos < array.length - iter; pos++) {
                if (array[pos] < array[pos - 1]) { // Swap the neighbouring values if they are in the incorrect positions
                    int temp = array[pos];
                    array[pos] = array[pos - 1];
                    array[pos - 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] array) {
        for (int iter = 1; iter < array.length; iter++) {
            int pos = iter - 1;
            int value = array[iter];

            while (pos >= 0 && array[pos] > value) { // Move items bigger than selected value one step right
                array[pos + 1] = array[pos];
                pos--;
            }
            array[pos + 1] = value; // Put the selected value in the position of the leftmost bigger item
        }
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start >= end) { // Stop if there's nothing t sort
            return;
        }

        int value = array[start + (end - start) / 2]; // Get value of the item in the center of the interval
        int left = start;
        int right = end;

        while (left <= right) {
            while (array[left] < value) { // Find the item on the left side bigger than the item in the center
                left++;
            }
            while (array[right] > value) { // Find the item on the right side smaller than the item in the center
                right--;
            }

            if (left <= right) { // Swap the bigger item on the left and the smaller item on the right
                int temp = array[right];
                array[right] = array[left];
                array[left] = temp;
                left++;
                right--;
            }
        }

        if (start < right) {
            quickSort(array, start, right); // Sort on the left of the selected item
        }
        if (end > left) {
            quickSort(array, left, end); // Sort on the right of the selected item
        }
    }
}