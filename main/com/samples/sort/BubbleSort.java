package com.samples.sort;

public class BubbleSort {

    public static void sort(int[] array) {
	int size = array.length;
	for (int i = 0; i < size; i++) {
	    for (int j = 1; j < size - 1; j++) {
		if (array[j] > array[j - 1]) {
		    int tmp = array[j - 1];
		    array[j - 1] = array[j];
		    array[j] = tmp;
		}
	    }
	    size--;
	}
    }

}
