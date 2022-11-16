/*
At a lemonade stand, each lemonade costs $5. Customers are standing in a queue to buy from you and order one at a time (in the order specified by bills). 
Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill. 
You must provide the correct change to each customer so that the net transaction is that the customer pays $5.
Note that you do not have any change in hand at first.
Given an integer array bills where bills[i] is the bill the ith customer pays, 
return true if you can provide every customer with the correct change, or false otherwise.
*/
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;
        
        for (int i = 0; i < bills.length; i++) {
            
            int curNum = bills[i];
            if (curNum == 5) {
                // no change is needed, add to fives
                fives++;
            } else if (curNum == 10) {
                // five dollar change is needed
                if (fives == 0) {
                    // if there are no fives, return false
                    return false;
                } else {
                    // otherwise, give one five and take one ten
                    fives--;
                    tens++;
                }
              
            } else {
                // fifteen dollars in change are needed
                if (tens > 0 && fives > 0) {
                    // if there is at least one five and ten, give a five and ten as change
                    fives--;
                    tens--;
                } else if (fives > 2) {
                    // otherwise, if there are more than two fives, give three fives as change
                    fives -= 3;
                } else {
                    // there is not correct change, return false
                    return false;
                }
                
            }
        }
        // there was always correct change, so return true
        return true;
    }
}
