package com.samples.sort;

/**
 * Bubble sort algorithm
 * @author Davidn
 *
 */
public class BubbleSort {

    /**
     * This algorithm sort an array by swapping the greater number to the last position of the array.
     * Checking if the current value is greater to the next one;
     * reducing the limit avoiding to check again the previous greater element
     * 
     * @param array
     */
    public static void sort(int[] array) {
	int boundary = array.length;
	for (int i = 0; i < array.length; i++) {
	    for (int j = 0; j < boundary - 1; j++) {
		if (array[j] > array[j + 1]) {
		    swap(array, j, j + 1);
		}
	    }
	    boundary--;
	}
    }

    /**
     * moves the current position to the next one and vice-versa
     * 
     * @param array
     * @param current
     * @param next
     */
    private static void swap(int[] array, int current, int next) {
	int tmp = array[next];
	array[next] = array[current];
	array[current] = tmp;
    }

}
