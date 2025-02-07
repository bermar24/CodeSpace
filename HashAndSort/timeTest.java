package HashAndSort;
import java.util.HashMap;

public class timeTest {
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int fibonacciIterative(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum; // reuse previous computation
        }
        return b;
    }

    public static int fibonacciMemo(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        if (memo.containsKey(n)) return memo.get(n); // Return stored value

        int result = fibonacciMemo(n - 1) + fibonacciMemo(n - 2);
        memo.put(n, result); // Store result for future calls

        return result;
    }

    public static long getAverageTime(int n, boolean useMemo, int runs) {
        long totalTime = 0;
        for (int i = 0; i < runs; i++) {
            memo.clear();
            long startTime = System.nanoTime();
            if (useMemo) {
                fibonacciMemo(n);
            } else {
                fibonacciIterative(n);
            }
            long endTime = System.nanoTime();
            totalTime += (endTime - startTime);
        }
        return totalTime / runs; // Average time in nanoseconds
    }

    public static void main(String[] args) {
        int runs = 10;
        int[] testValues = {5, 10, 15, 20, 25, 30, 35, 40}; // Fibonacci numbers to test

        System.out.printf("%-10s %-15s %-15s%n", "N", "Iterative (ns)", "Memoized (ns)");
        System.out.println("--------------------------------------------------");

        for (int n : testValues) {
            long timeIterative = getAverageTime(n, false, runs);
            long timeMemoized = getAverageTime(n, true, runs);
            System.out.printf("%-10d %-15d %-15d%n", n, timeIterative, timeMemoized);
        }
    }
}