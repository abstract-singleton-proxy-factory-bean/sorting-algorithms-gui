package com.aps.sortingalgorithms.sorting.algorithms;

import java.util.Arrays;

public class InsertionSort implements ISortableAlgorithm {
    /**
     * Sorts a given list using the insertion sort algorithm
     *
     * @param source Original list to be sorted
     * @return Sorted list
     */
    @Override
    public Integer[] sort(Integer[] source) {
        Integer[] cloned = Arrays.copyOf(source, source.length);
        sort(cloned, cloned.length);
        return cloned;
    }

    private void sort(Integer[] source, int length) {
        for (int i = 1; i < length; i++) {
            int key = source[i];
            int j = i - 1;
            while (j >= 0 && source[j] > key) {
                source[j + 1] = source[j];
                j -= 1;
            }
            source[j + 1] = key;
        }
    }
}
