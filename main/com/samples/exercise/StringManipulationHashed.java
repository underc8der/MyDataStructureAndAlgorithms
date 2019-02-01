package com.samples.exercise;

public class StringManipulationHashed {
    
    public static boolean find(String source, String seek) {
	int seekLength = seek.length();
	int sourceLength = (source.length() - seekLength);
	
	int sizeHash = source.length() - (seek.length() - 1) ;
	int key = generateHash(seek, sizeHash);
	
	String[] tokens = new String[sizeHash];
	for (int i = 0; i <= sourceLength; i++) {
	    String subStr = source.substring(i,  i + seekLength);
	    int hash = generateHash(subStr, sizeHash);
	    tokens[hash] = subStr;
	}
	
	return tokens[key] != null && seek.equals(tokens[key]);
    }
    
    private static int generateHash(String subStr, int sizeHash) {
	int sum = 0;
	for (int i = 0; i < subStr.length(); i++) {
	    sum += ((int)subStr.charAt(i)) * (26 ^ (subStr.length() - (i + 1)));
	}
	return sum % sizeHash;
    }
}
