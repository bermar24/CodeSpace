package HashAndSort;

// Todo Insertion sort
// Best for nearly sorted data
// Best: O(n), Worst: O(n^2), Avg: O(n^2)
//    O = Operation
//    n = number of elements

public class insertionSort {
    public static int[] main(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
