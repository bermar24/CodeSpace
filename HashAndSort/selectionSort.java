package HashAndSort;

//    TODO Selection sort
// Used when memory is limited
// Always O(n^2), not stable but in-place sorting
//    Worst case: O(n^2)
//    Best case: O(n^2)
//    O = Operation
//    n = number of elements


public class selectionSort {
    public static int[] main(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
