public class Main {
    public static void main(String[] args) {
        int[] array = new int[0];
        long sortingDuration = 0;

        // Count an average duration of 100 sorts
        for (int iter = 0; iter < 100; iter++) {
            array = createFilledArray(10000);
            long startTime = System.nanoTime();

            //SuperSorter.bubbleSort(array);
            //SuperSorter.insertionSort(array);
            SuperSorter.quickSort(array, 0, array.length - 1);

            sortingDuration += System.nanoTime() - startTime;
        }
        sortingDuration /= 100;

        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println("\nSorting duration: " + sortingDuration / 1000 + " mks");
    }

    public static int[] createFilledArray(int length) {
        int[] array = new int[length];
        fillArray(array);
        return array;
    }

    public static void fillArray(int[] array) {
        for (int iter = 0; iter < array.length; iter++) {
            array[iter] = (int) (Math.random() * 1000) % 1000;
            if ((int) (Math.random() * 2) % 2 == 0) {
                array[iter] = -array[iter];
            }
        }
    }
}