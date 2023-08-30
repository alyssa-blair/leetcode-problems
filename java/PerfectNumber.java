/*
A perfect number is a positive integer that is equal to the sum of its 
positive divisors, excluding the number itself. A divisor of an integer x is 
an integer that can divide x evenly.

Given an integer n, return true if n is a perfect number, otherwise return false.
*/


class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 1;
        
        if (num == 1) {
            return false;
        }

        for (int i = 2; i <= num/2; i++) {
            // check if i is a divisor for num
            if (num % i == 0) {
                // check if already have all divisors
                int other = num / i;
                if (i < other) {
                    // if not, add i and the other divisor to the sum
                    sum += i + other;
                } else {
                    break;
                }
            }
        }
        
        // if the sum is also the num, return true
        return sum == num;
    }
}
