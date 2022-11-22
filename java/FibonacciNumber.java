/*
The Fibonacci numbers, commonly denoted F(n) form a sequence, 
called the Fibonacci sequence, such that each number is the sum of 
the two preceding ones, starting from 0 and 1. 

Given n, calculate F(n)
*/

class Solution {
    public int fib(int n) {
        // check base cases
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        // otherwise, start recursion
        return fibrec(n,0,1,1);
    }
    
    public int fibrec(int n, int prev1, int prev2, int count) {
        if (count == n) {
            // if the number of recursions have been reached, return the last value
            return prev2;
        } else {
            // otherwise, find the new value and call the function again
            int total = prev1+prev2;
            prev1 = prev2;
            prev2 = total;
            return fibrec(n, prev1, prev2, count+1);
        }
    }
}
