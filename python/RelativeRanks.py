class Solution(object):
    def findRelativeRanks(self, score):
        placement = 1
        medalArray = []
        for k in range(0,len(score)):
            medalArray.append(" ")
        for i in range(len(score)):
            cur = score[i]
            for j in score:
                if (cur< j):
                    placement += 1
            if (placement == 1):
                medalArray[i] = "Gold Medal"
            elif (placement == 2):
                medalArray[i] = "Silver Medal"
            elif (placement == 3):
                medalArray[i] = "Bronze Medal"
            else:
                medalArray[i] = f"{placement}"
            placement = 1
        return medalArray
