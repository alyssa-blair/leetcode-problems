/*
Given two strings needle and haystack, 
return the index of the first occurrence of needle in haystack, 
or -1 if needle is not part of haystack.
*/


class Solution {
    public int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)) {
            // if the string doesn't contain a substring that has needle, return -1
            return -1;
        } else {
            // otherwise, return the index of the first occurrence
            return haystack.indexOf(needle);
        }
    }
}
