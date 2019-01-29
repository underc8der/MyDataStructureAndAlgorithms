package com.samples.exercise;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringManipulationHashedTest {

    @Test
    public void find_ExistingWord_succesful() {
	String source = "abcdefghlmnopqrstuijk";
	String seek = "ijk";
	boolean exist = StringManipulationHashed.find(source, seek);
	assertTrue(exist);
    }
    
    @Test
    public void find_NonExistingWord_succesful() {
	String source = "abcdefghlmnopqrstuijk";
	String seek = "zqk";
	boolean exist = StringManipulationHashed.find(source, seek);
	assertFalse(exist);
    }
}
