/*
A password is said to be strong if it satisfies all the following criteria:

It has at least 8 characters.
It contains at least one lowercase letter.
It contains at least one uppercase letter.
It contains at least one digit.
It contains at least one special character. The special characters are the characters in the following string: "!@#$%^&*()-+".
It does not contain 2 of the same character in adjacent positions (i.e., "aab" violates this condition, but "aba" does not).

Given a string password, return true if it is a strong password. Otherwise, return false.
*/


class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) {
            return false;
        }
      
        boolean lower = false;
        boolean upper = false;
        boolean digit = false;
        boolean special = false;
        String specStr = "!@#$%^&*()-+";
        char prevChar = ' ';
        char curChar = ' ';
        
        for (int i = 0; i < password.length(); i++) {
            curChar = password.charAt(i);
            if (curChar == prevChar) {
                return false;
            }
            // set values to true if the current character meets a requirement
            if (curChar <='z' && curChar >='a') {
                lower = true;
            } else if (curChar <= 'Z' && curChar >= 'A') {
                upper = true;
            } else if (specStr.contains(curChar + "")) {
                special = true;
            } else if (curChar >= '0' && curChar <= '9') {
                digit = true;
            }
            prevChar = curChar;
        }

        // if any requirements were missed, return false
        return lower && upper && digit && special;
    }
}
