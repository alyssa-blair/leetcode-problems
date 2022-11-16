class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        if (t.length() < s.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
    
            if (index >= t.length()) {
                return false;
            }
            
            for (int j = index; j < t.length(); j++) {

                char tChar = t.charAt(j);
                if (tChar == sChar) {
                    index = j+1;
                    break;
                } else if (j == t.length() - 1) {
                    return false;
                }
            }
        
        }
        return true;
    }
}
