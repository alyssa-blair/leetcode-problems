class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 1;
        
        if (num == 1) {
            return false;
        }

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                int other = num / i;
                if (i < other) {
                    sum += i + other;
                } else {
                    break;
                }
            }
        }

        if (sum == num) {
            return true;
        }
        return false;
    }
}
