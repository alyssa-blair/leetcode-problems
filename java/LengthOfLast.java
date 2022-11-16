class Solution {
    public int lengthOfLastWord(String s) {
        String word = "";
        int space = 0;
        String prev = "";

        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            word += curChar;
            if (curChar == ' ') {
                word = "";
            } else {
                prev = word;
            }
        }
        
        if (word.length() == 0) {
            return prev.length();
        }
        return word.length();
    }
}
