package com.aps.sortingalgorithms;

import com.aps.utils.observables.IListener;
import com.aps.utils.observables.Observable;

public class DataLayer {

    public Observable<Integer> listSize = new Observable<>(10);
    public Observable<Double> mergeSortResult = new Observable<>(0.0);
    public Observable<Double> insertionSortResult = new Observable<>(0.0);
    public Observable<Double> radixSortResult = new Observable<>(0.0);
    public Observable<Double> quickSortResult = new Observable<>(0.0);
    public Observable<Double> heapSortResult = new Observable<>(0.0);
    public Observable<Double> bubbleSortResult = new Observable<>(0.0);

    /**
     * Subscribes a JTextField to a value change on a given observable
     *
     * @param field Field to be subscribed to the change in the observable
     * @return Returns a listener for the observer
     */
    public static IListener<Double> makeListener(javax.swing.JTextField field) {
        return (value) -> {
            field.setText(value + "ms");
        };
    }

}
