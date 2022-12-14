class Solution {
    public int minAddToMakeValid(String s) {
        // create count for open and closed brackets
        int closed = 0;
        int open = 0;

        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);

            // if the character is an open bracket, add to open count
            if (curChar == '(') 
            {
                open++;
            } 

            else 
            {
                // if there is no open bracket, add to closed
                if (open == 0) 
                { 
                    closed++; 
                } 
                
                // found a pair, subtract from open count
                else 
                { 
                    open--;
                }
            }
        }

        return open + closed;
    }
}
