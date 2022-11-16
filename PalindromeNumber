class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        
        for (int i = 0; i < s.length(); i++) {
            if (s.length()-i-1 <= i) {
                return true;
            } 
            char front = s.charAt(i);
            char end = s.charAt(s.length()-i-1);
            
            if (front != end) {
                return false;
            }
        }
        return true;
    }
}
