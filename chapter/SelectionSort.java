public class SelectionSort {
    public static void sort(String[] x) {
        /**
         * step1: find the smallest item
         * step2: move it to the front
         * step3: selection sort the rest(using recursion??)
         * */
        sort(x, 0);

    }

    /**
     * sort starting at position
     */
    private static void sort(String[] x, int index) {
        if (index == (x.length - 1)) return;
        int indexOfSmallest = findSmallestIndex(x, index);
        swap(x, indexOfSmallest, index);
        sort(x, index + 1);
    }


    /**
     * find the smallest item in the array.
     */
    public static int findSmallestIndex(String[] x, int index) {
        int TheSmallestIndex = index;
        for (int i = index; i < x.length; i++) {
            if (x[i].compareTo(x[TheSmallestIndex]) < 0) {
                TheSmallestIndex = i;
            }
        }
        return TheSmallestIndex;
    }

    /**
     * swap item a and b.
     */
    public static void swap(String[] x, int a, int b) {
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }
}
