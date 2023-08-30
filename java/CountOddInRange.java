/*
Given two non-negative integers low and high. 
Return the count of odd numbers between low and high (inclusive).
*/

class Solution {
    public int countOdds(int low, int high) {
        int diff = high-low;
        if (diff % 2 == 0) {
            return diff / 2 + (high % 2 == 0 ? 0 : 1);
        } else {
            return (diff + 1) / 2;
        }
    }
}
