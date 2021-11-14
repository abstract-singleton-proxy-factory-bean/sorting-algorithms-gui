package com.aps.sortingalgorithms.sorting.algorithms;

import java.util.Arrays;
import java.util.Random;
import com.aps.sortingalgorithms.utils.arrays.ArrayUtils;

public class QuickSort implements ISortableAlgorithm {

    /**
     * Sorts a given list using the radix sort algorithm
     *
     * @param source Original list to be sorted
     * @return Sorted list
     */
    @Override
    public Integer[] sort(Integer[] source) {
        Integer[] sorted = Arrays.copyOf(source, source.length);

        sort(sorted, 0, sorted.length - 1);

        return sorted;
    }

    private void sort(Integer[] source, int low, int high) {
        if (low < high + 1) {
            int partition = this.partition(source, low, high);
            sort(source, low, partition - 1);
            sort(source, partition + 1, high);
        }
    }

    private int getPivot(int low, int high) {
        Random random = new Random();
        return random.nextInt((high - low) + 1) + low;
    }

    private int partition(Integer[] source, int low, int high) {
        ArrayUtils.swap(source, low, getPivot(low, high));

        int border = low + 1;

        for (int i = border; i <= high; i++) {
            if (source[i] < source[low]) {
                ArrayUtils.swap(source, i, border++);
            }
        }

        ArrayUtils.swap(source, low, border - 1);
        return border - 1;
    }
}
