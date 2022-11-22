/*
Given a string s, find the first non-repeating 
character in it and return its index. 
If it does not exist, return -1.
*/

class Solution {
    public int firstUniqChar(String s) {
        String left = "";
        
        for (int i = 0; i < s.length(); i++){
            // take the current char and substring after the current index
            char curChar = s.charAt(i);
            String substring = s.substring(i+1, s.length());
            if (!substring.contains(curChar + "") && !left.contains(curChar + "")) {
                // if the substring before or after contain this char, return the index of the char
                return i;
            } else {
                // otherwise, add the char to the left substring
                left += curChar;
            }
        }
        return -1;
    }
}
