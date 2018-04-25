package org.leetcode.easy;

public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length()-1;
        while(i <= j) {
        	if(s.charAt(i) != s.charAt(j)) {
        		return isPalindrome(s, i+1, j) ||
        				isPalindrome(s, i, j-1);
        	}
        	i++;
        	j--;
        }
        return true;
    }
    public boolean isPalindrome(String s, int start, int end) {
    	int i = start, j = end;
    	while(i <= j) {
    		if(s.charAt(i) != s.charAt(j))
    			return false;
    		i++;
    		j--;
    	}
    	return true;
    }
}
