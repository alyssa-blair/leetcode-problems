/*
Given an integer x, return true if x is a palindrome, and false otherwise.
*/

class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        
        // parse the string tracking front and end current characters
        for (int i = 0; i < s.length(); i++) {
            if (s.length()-i-1 <= i) {
                // if the string is of odd length or end is smaller than front, return true
                return true;
            } 
            char front = s.charAt(i);
            char end = s.charAt(s.length()-i-1);
            
            if (front != end) {
                // if they are not equal, not a palindrome
                return false;
            }
        }
        return true;
    }
}
