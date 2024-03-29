/*
We have n chips, where the position of the ith chip is position[i].

We need to move all the chips to the same position. In one step, we can change the position of the ith chip from position[i] to:

position[i] + 2 or position[i] - 2 with cost = 0.

position[i] + 1 or position[i] - 1 with cost = 1.

Return the minimum cost needed to move all the chips to the same position.
*/

class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
      
        for (int i = 0; i < position.length; i++) {
            int curNum = position[i];
            if (curNum % 2 == 0) {
                // if the current chip is in an even position, add to even
                even++;
            } else {
                // otherwise, add to odd
                odd++;
            }
        }
        
        // return the lower moves
        return (even > odd ? odd : even);
    }
}
