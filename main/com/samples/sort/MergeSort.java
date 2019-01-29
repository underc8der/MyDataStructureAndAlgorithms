package com.samples.sort;

/**
 * Merge sort algorithm
 * 
 * @author Davidn
 *
 */
public class MergeSort {

    public static void sort(int[] array) {
	divide(array);
    }

    /**
     * This method divides the problem into sub-arrays left and right
     * until there the sub-array has a size of one.
     * 
     * @param source
     */
    private static void divide(int[] source) {
	int high = source.length;
	if (1 < source.length) {
	    int midPoint = high / 2;
	    int[] left = new int[midPoint];
	    int[] righ = new int[high - midPoint];
	    for (int i = 0; i < midPoint; i++) {
		left[i] = source[i];
	    }
	    for (int i = 0; i < (high - midPoint); i++) {
		righ[i] = source[i + midPoint]; 
	    }
	    divide(left);
	    divide(righ);
	    merge(source, left, righ, midPoint, high - midPoint);
	}
    }
    
    /**
     * This method accomplishes the conquers and merge function, 
     * comparing sub-arrays left and right to get the lowest value 
     * and merging into destination array.
     *  
     * @param dest
     * @param left
     * @param right
     * @param leftHigh
     * @param rightHigh
     */
    private static void merge(int[]dest, int[]left, int[]right, int leftHigh, int rightHigh) {
	int l = 0;
	int r = 0;
	int k = 0;
	// swaps the values
	while (l < leftHigh && r < rightHigh) {
	    if (left[l] <= right[r]) {
		dest[k++] = left[l++];
	    } else {
		dest[k++] = right[r++];
	    }
	}
	// Below loops iterate over the remaining values
	while (l < leftHigh) {
	    dest[k++] = left[l++];
	}
	while (r < rightHigh) {
	    dest[k++] = right[r++];
	}
    }
}
