package com.aps.sortingalgorithms.utils.benchmark;

import com.aps.sortingalgorithms.sorting.algorithms.ISortableAlgorithm;
import java.util.Random;

/**
 * Benchmark helper for the UI client
 */
public class Benchmark {

    /**
     * Executes a benchmark on a given algorithms and returns its execution time
     * in milliseconds
     *
     * @param algorithm Algorithm to run benchmark on
     * @param list List to provide to the benchmark
     * @return Execution time in milliseconds
     */
    public static double runBenchmark(ISortableAlgorithm algorithm, Integer[] list) {
        long start = System.nanoTime();
        algorithm.sort(list);
        long end = System.nanoTime();
        double executionTime = (end - start) / 1_000_000;
        return executionTime;
    }

    /**
     * Makes a list of `n` size
     *
     * @param size List size
     * @return List of integers of `n` size
     */
    public static Integer[] makeList(int size) {
        Integer[] list = new Integer[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list[i] = random.nextInt(1_000_000);
        }

        return list;
    }
}
