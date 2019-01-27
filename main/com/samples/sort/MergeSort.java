package com.samples.sort;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
    
    protected static void divide2(int[] array, int min, int max) {
	if (min < max) {
	    int mid = min + (max - min) / 2;
	    int[] la = new int[mid];
	    int[] ra = new int[max - mid];
	    for (int i = 0; i < mid; i++) {
		la[i] = array[mid - min];
	    }
	    for (int i = 0; i < mid; i++) {
		ra[i] = array[max - mid]; 
	    }
	    divide(array, min, mid);
	    divide(array, mid + 1, max);
	    merge(array, la, ra, min, max);
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
//		swap(array, temp, k, i);
//		i++;
	    } else {
//		array[k] = temp[j];
		swap(array, temp, k, j);
		j++;
	    }
	}
    }
    
    protected static void merge(int[]dest, int[]la, int[]ra, int low, int high) {
	int li = 0;
	int ri = 0;
	for (int i = low; i < high; i++) {
	    if (la[li] <= ra[ri]) {
		dest[i] = la[li++];
	    } else {
		dest[i] = ra[ri++];
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
