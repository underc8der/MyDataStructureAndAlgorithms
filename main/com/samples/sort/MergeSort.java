package com.samples.sort;

import java.util.Arrays;

public class MergeSort {

    public static void sort(int[] array) {
	divide(array);
	Arrays.stream(array).forEach(System.out::print);
    }

    protected static void divide(int[] array) {
	int n = array.length;
	if (1 < array.length) {
	    int mid = n / 2;
	    int[] la = new int[mid];
	    int[] ra = new int[n - mid];
	    for (int i = 0; i < mid; i++) {
		la[i] = array[i];
	    }
	    for (int i = 0; i < (n - mid); i++) {
		ra[i] = array[i + mid]; 
	    }
	    divide(la);
	    divide(ra);
	    merge(array, la, ra, 0, array.length);
	}
    }
    
    private static void merge(int[]dest, int[]la, int[]ra, int low, int high) {
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
}
