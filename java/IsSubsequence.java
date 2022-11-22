/*
Given two strings s and t, return true if s is a subsequence of t, 
or false otherwise.

A subsequence of a string is a new string that is formed from the 
original string by deleting some (can be none) of the characters 
without disturbing the relative positions of the remaining characters. 
(i.e., "ace" is a subsequence of "abcde" while "aec" is not).
*/


class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            
            if (index >= t.length()) {
                // if the string s is longer than t, return false
                return false;
            }
            
            for (int j = index; j < t.length(); j++) {
                char tChar = t.charAt(j);
                
                // for the current char in s, check if it is in t
                if (tChar == sChar) {
                    // if the letter is in t, increase the next index and exit the loop
                    index = j+1;
                    break;
                } else if (j == t.length() - 1) {
                    // if the letter was not in t, return false
                    return false;
                }
            }
        
        }
        return true;
    }
}
