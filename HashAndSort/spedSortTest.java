package HashAndSort;
import javax.xml.transform.SourceLocator;
import java.util.HashMap;
import java.util.function.Function;

public class spedSortTest {
//    public static void main(String[] args) {
//        int[] testValues = {5, 10, 23, 20, 25, 30, 35, 40};
//        int[] sortedValues = bubbleSort(testValues);
//        for (int value : sortedValues) {
//            System.out.print(value + " ");
//        }
//    }

    public static long getAverageTime(int[] n, int runs, Function<int[], int[]> sortFunction) {
        long totalTime = 0;
        for (int i = 0; i < runs; i++) {
            long startTime = System.nanoTime();
            sortFunction.apply(n);
            long endTime = System.nanoTime();
            totalTime += (endTime - startTime);
        }
        return totalTime / runs; // Average time in nanoseconds
    }
    public static void main(String[] args) {
        int runs = 10;
        int[] testValues = {5, 10, 15, 20, 25, 30, 35, 40};

        System.out.println("Bubble Sort Test: " + getAverageTime(testValues, runs,HashAndSort.bubbleSort::main) + " ns");
        System.out.println("Selection Sort Test: " + getAverageTime(testValues, runs,HashAndSort.selectionSort::main) + " ns");
        System.out.println("Insertion Sort Test: " + getAverageTime(testValues, runs,HashAndSort.insertionSort::main) + " ns");
        System.out.println("Heap Sort Test:" + getAverageTime(testValues, runs,HashAndSort.heapSort::heapSort) + " ns");
        System.out.println("Shell Sort Test:" + getAverageTime(testValues, runs,HashAndSort.shellSort::main) + " ns");
        System.out.println("Counting Sort Test:" + getAverageTime(testValues, runs,HashAndSort.countingSort::main) + " ns");
        System.out.println("Tim Sort Test:" + getAverageTime(testValues, runs,HashAndSort.timSort::main) + " ns");
        System.out.println("Radix Sort Test:" + getAverageTime(testValues, runs,HashAndSort.radinxSort::main) + " ns");
//        System.out.println("Merge Sort Test:" + getAverageTime(testValues, runs,HashAndSort.mergeSort::main) + " ns");
//        System.out.println("Quick Sort Test:" + getAverageTime(testValues, runs,HashAndSort.quickSort::quickSort) + " ns");


    }
}
