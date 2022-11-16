/*
You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', representing the color of the ith block. The characters 'W' and 'B' denote the colors white and black, respectively.

You are also given an integer k, which is the desired number of consecutive black blocks.

In one operation, you can recolor a white block such that it becomes a black block.

Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.

*/

int minimumRecolors(char * blocks, int k){
    int lowest = k;

    while (strlen(blocks) >= k) {
        int wCount = 0;
        // check how many white blocks are in the current substring
        for (int i = 0; i < k; i++) {
            char curChar = blocks[i];
            if (curChar == 'W') {
                wCount++;
            }
        }
        
        // if this number of white blocks is lower than all previous, set as lowest
        if (wCount < lowest) {
            lowest = wCount;
        }
        blocks++;
    }
    return lowest;
    
}
