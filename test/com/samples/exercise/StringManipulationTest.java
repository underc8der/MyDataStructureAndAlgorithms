package com.samples.exercise;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringManipulationTest {

    @Test
    public void find_existingWord_succesful() {
	String source = "abcdefghlmnopqrstuijk";
	String seek = "ijk";
	boolean exist = StringManipulation.find(source, seek);
	assertTrue(exist);
    }
}
