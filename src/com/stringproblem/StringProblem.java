package com.stringproblem;

public class StringProblem {
	
	public String removeOccurences(String s, char c){
		if (s == null)
			return null;
		
		StringBuffer result = new StringBuffer();
		
		for (int i=0; i<s.length(); i++){
			if (s.charAt(i) == c){
				continue;
			}
			result.append(s.charAt(i));
		}
		
		return result.toString();
	}
	
	public String removeOccurencesLib(String s, char c){
		if (s == null)
			return null;
		return s.replace(""+c, "");
	}

}
