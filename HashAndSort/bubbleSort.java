package HashAndSort;

//    TODO Buble sort
// Simple but inefficient sorting algorithm
// Suitable for small datasets or educational purposes
// Time Complexity:
// Best: O(n)  (Already sorted)
// Worst: O(n^2) (Reversely sorted)
// Average: O(n^2)
//    O = Operation
//    n = number of elements

public class bubbleSort {
    public static int[] main(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Optimization: Stop if no swaps occur
        }
        return arr;
    }
}
