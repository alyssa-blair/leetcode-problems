class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        placement = 1
        medalArray = [0] * len(score)

        for i in range(len(score)):
            cur = max(score)
            index = score.index(cur)
            score[index] = -1        
            match placement:
                case 1:
                    medalArray[index] = "Gold Medal"
                case 2:
                    medalArray[index] = "Silver Medal"
                case 3:
                    medalArray[index] = "Bronze Medal"
                case _:
                    medalArray[index] = f"{placement}"

            placement += 1

        return medalArray
        return medalArray
