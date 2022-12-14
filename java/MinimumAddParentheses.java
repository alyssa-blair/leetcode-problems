/*
A parentheses string is valid if and only if:

It is the empty string,
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.

For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
Return the minimum number of moves required to make s valid.
*/



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
