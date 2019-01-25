package com.samples.sort;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {
    
    int[] unsorted = new int[7];
    int[] expected;

    @Before
    public void setUp() throws Exception {
	for (int i = 0; i < unsorted.length; i++) {
	    unsorted[i] = ThreadLocalRandom.current().nextInt(10);
	}
	expected = unsorted;
	Arrays.sort(expected);
    }

    @Test
    public void testSort() {
	BubbleSort.sort(unsorted);
	assertArrayEquals(expected, unsorted);
    }

}
