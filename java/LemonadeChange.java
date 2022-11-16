

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
