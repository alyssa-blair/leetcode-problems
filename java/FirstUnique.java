class Solution {
    public int firstUniqChar(String s) {
        String wrong = "";
        
        for (int i = 0; i < s.length(); i++){
            char curChar = s.charAt(i);
            String substring = s.substring(i+1, s.length());
            if (!substring.contains(curChar + "") && !wrong.contains(curChar + "")) {
                return i;
            } else {
                wrong += curChar;
            }
        }
        return -1;
    }
}
