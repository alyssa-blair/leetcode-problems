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
