from typing import List
from itertools import combinations

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # Brute force (comentado para usar hash map)
        # for i in range(len(nums)):
        #     for j in range(i + 1, len(nums)):
        #         if (nums[i] + nums[j] == target):
        #             return [i, j]

    # map = {}
    # for i in range(len(nums)):
    #     complement = target - numsp[i]
    #     if complement in map:
    #         return [map[complement], i]
    #     map[nums[i]] = i    

    # numMap = {}
    # for i, num in enumerate(nums):
    #     numMap[num] = i
    # for i, num in enumerate(nums):
    #     complement = target - num
    #     if complement in numMap and numMap[complement] != i:
    #         return [i, numMap[complement]]


    # pos = {x: i for i, x in enumerate(nums)}

    #     for i, x in enumerate(nums):
    #         need = target - x
    #         if need in pos and pos[need] != i:
    #             return [i, pos[need]]

    # for (i, a), (j, b) in combinations(enumerate(nums), 2):
    #         if a + b == target:
    #             return [i, j]

    # arr = [(v, i) for i, v in enumerate(nums)]
    #     arr.sort()

    #     l, r = 0, len(arr) - 1
    #     while l < r:
    #         s = arr[l][0] + arr[r][0]
    #         if s == target:
    #             return [arr[l][1], arr[r][1]]
    #         if s < target:
    #             l += 1
    #         else:
    #             r -= 1




        numMap = {}
        for i, num in enumerate(nums):
            complement = target - num
            if complement in numMap:
                return [numMap[complement], i]
            numMap[num] = i
        return []

if __name__ == "__main__":
    solution = Solution()
    nums = [2, 7, 11, 15]
    target = 9
    result = solution.twoSum(nums, target)
    print(result)  # [0, 1]