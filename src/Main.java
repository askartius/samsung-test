public class Main {
    public static void main(String[] args) {
        int[] array = createFilledArray(1000);

        long startTime = System.nanoTime();

        //SuperSorter.bubbleSort(array);
        SuperSorter.insertionSort(array);

        long methodTime = System.nanoTime() - startTime;

        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println("\nRun time: " + methodTime + " ns");
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