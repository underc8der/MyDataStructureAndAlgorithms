package com.samples.exercise;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.ThreadLocalRandom;

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
	String source = "abcd";
	String seek = "zqa";
	boolean exist = StringManipulationHashed.find(source, seek);
	assertFalse(exist);
    }
    
    @Test
    public void find_RandomValues_Succesful() {
	StringBuilder source = new StringBuilder(11);
	for (int i = 0; i < 11; i++) {
	    char c = (char)ThreadLocalRandom.current().nextInt(97, 122);
	    source.append(c);
	}
	int init = ThreadLocalRandom.current().nextInt(8);
	String seek = source.toString().substring(init, init + 2);
	System.out.println(seek + " :: " + source.toString());
	boolean exist = StringManipulationHashed.find(source.toString(), seek);
	assertTrue(exist);
    }
}
