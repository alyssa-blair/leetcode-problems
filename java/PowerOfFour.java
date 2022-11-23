/*
Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4x.

*/

class Solution {
    public boolean isPowerOfFour(int n) {
        float val = n;
        
        while (val > 4) {
            val = val / 4;
        }
       
        if (val == 1 || val == 4) {
            return true;
        } else {
            return false;
        }
    }
}
