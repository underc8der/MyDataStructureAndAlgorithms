package com.samples.sort;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.Test;

public class MergeSortTest {

    /*
     * set up a new random array for testing and set up an expected array using
     * Arrays sorting
     */
    @Test
    public void sort_RandomValues_Succesful() {
	int[] unsorted = new int[7];
	for (int i = 0; i < unsorted.length; i++) {
	    unsorted[i] = ThreadLocalRandom.current().nextInt(10);
	}
	// brings a new sorted array based the original `unsorted` array
	int[] expected = Arrays.stream(unsorted).sorted().toArray();
	MergeSort.sort(unsorted);
	Arrays.stream(unsorted).forEach(System.out::print);
	assertArrayEquals(expected, unsorted);
    }

    @Test
    public void sort_StaticValues_Succesful() {
	int[] unsorted = { 5, 3, 7, -1, 6 };
	int[] expected = { -1, 3, 5, 6, 7 };
	MergeSort.sort(unsorted);
	assertArrayEquals(expected, unsorted);
    }

    @Test
    public void sort_Empty_Succesful() {
	int[] unsorted = {};
	int[] expected = {};
	MergeSort.sort(unsorted);
	assertArrayEquals(expected, unsorted);
    }

    @Test
    public void sort_SingleValue_Succesful() {
	int[] unsorted = { 1 };
	int[] expected = { 1 };
	MergeSort.sort(unsorted);
	assertArrayEquals(expected, unsorted);
    }

    @Test
    public void sort_Couple_Succesful() {
	int[] unsorted = { 5, 1 };
	int[] expected = { 1, 5 };
	MergeSort.sort(unsorted);
	assertArrayEquals(expected, unsorted);
    }

    @Test
    public void sort_SameValuesLessOne_Succesful() {
	int[] unsorted = { 7, 7, 7, 7, 7, 7, 1 };
	int[] expected = { 1, 7, 7, 7, 7, 7, 7 };
	MergeSort.sort(unsorted);
	assertArrayEquals(expected, unsorted);
    }

}
