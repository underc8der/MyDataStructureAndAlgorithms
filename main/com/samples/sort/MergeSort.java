package com.samples.sort;

import java.util.Arrays;

public class MergeSort {

    public static void sort(int[] array) {
	divide(array, 0, array.length - 1);
	Arrays.stream(array).forEach(System.out::print);
    }

    protected static void divide(int[] array, int min, int max) {
	if (min < max) {
	    int middle = min + (max - min) / 2;
	    divide(array, min, middle);
	    divide(array, middle + 1, max);
	    merge(array, min, middle, max);
	}

    }
    
    private static void merge(int[] array, int min, int mid, int max) {
	int[] temp = new int[array.length];
	for (int i = min; i <= max; i++) {
	    temp[i] = array[i];
	}
	int i = min;
	int j = mid;
	for (int k = min; k < mid; k++) {
	    if (temp[i] < temp[j]) {
//		array[k] = temp[i];
		swap(array, temp, k, i);
		i++;
	    } else {
//		array[k] = temp[j];
		swap(array, temp, k, j);
		j++;
	    }
	}
    }
    
    /**
     * moves the current position to the next one and vice-versa
     * 
     * @param array
     * @param current
     * @param next
     */
    private static void swap(int[] array, int[] temp, int current, int next) {
	array[next] = temp[current];
	array[current] = temp[next];
    }
}
