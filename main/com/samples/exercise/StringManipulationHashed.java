package com.samples.exercise;

import java.util.HashMap;
import java.util.Map;

public class StringManipulationHashed {
    
    public static boolean find(String source, String seek) {
	int seekLength = seek.length();
	int sourceLength = (source.length() - seekLength);
	if (seekLength > source.length()) {
	    return false;
	}
	Map<String, Integer> hashedValues = new HashMap<>();
	for(int i = 0; i <= sourceLength; i++) {
	    hashedValues.put(source.substring(i,  i + seekLength), 1);
	}
	
	return hashedValues.containsKey(seek);
    }
    
    public static void main(String[] args) {
	char a = 'z';
	int b = a >> 1;
	System.out.println(1 << a - 'z');
	System.out.println(b);
    }
    
    static long hash(String subStr)
    {
        long hash = 5381;
        for (char c: subStr.toCharArray())
            hash = ((hash << 5) + hash) + c; /* hash * 33 + c */

        return hash;
    }
}
