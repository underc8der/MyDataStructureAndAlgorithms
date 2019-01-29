package com.samples.exercise;

public class StringManipulation {
    
    public static boolean find(String source, String seek) {
	boolean exist = false;
	int seekLength = seek.length();
	int sourceLength = (source.length() - seekLength);
	if (seekLength > source.length()) {
	    return false;
	}
	String compare = null;
	for(int i = 0; i <= sourceLength; i++) {
	    compare = source.substring(i,  i + seekLength);
	    if (compare.equals(seek)) {
		exist = true;
		break;
	    }
	}
	return exist;
    }
}
