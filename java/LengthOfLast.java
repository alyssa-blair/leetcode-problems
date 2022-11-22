/*
Given a string s consisting of words and spaces, 
return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.
*/

class Solution {
    public int lengthOfLastWord(String s) {
        // split the string into an array of words
        String[] words = s.split(" ");
        
        // return the length of the last word in the array
        return words[words.length-1].length();
    }
}
