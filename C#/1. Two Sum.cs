using System.Collections.Generic;
using System.Linq;
using System;

public class Solution {
    public int[] TwoSum(int[] nums, int target) {
    //Brute Force Approach
    //    int[] result = new int[2];
    //     for (int i = 0; i < nums.Length; i++) {
    //         for (int j = i + 1; j < nums.Length; j++) {
    //             if (nums[i] + nums[j] == target) {
    //                 result[0] = i;
    //                 result[1] = j;
    //                 return result;
    //             }
    //         }
    //     }
    //     return result;
    // }

    //Brute Force Approach
    // for (int i = 0; i < nums.Length; i++){
    //     for (int j = i + 1; j<nums.Length; j++){
    //         if ((nums[i] + nums[j]) == target){
    //              return new int[]{i,j};
    //         }
    //      }
    // }
    // return new int[]{};

    //Sorting and Two Pointers Approach
    //  (int num, int index)[] numbers = nums.Select((num, index) => (num, index)).ToArray();
    // Array.Sort(numbers, (a, b) => a.num.CompareTo(b.num));

    // int left = 0, right = nums.Length - 1;
    // while(left < right) {
    //     int sum = numbers[left].num + numbers[right].num;
    //     if(sum == target) {
    //         return new int[] { numbers[left].index, numbers[right].index };
    //     } else if(sum < target) {
    //         left++;
    //     } else {
    //         right--;
    //     }
    // }
    // return new int[] { };
  

    //Hash Table Appoach
    // Dictionary<int, int> map = new Dictionary<int, int>();
    // for (int i = 0; i < nums.Length; i++){
    //     int complement = target - nums[i];
    //     if (map.ContainsKey(complement)){
    //         return new int[]{map[complement], i};
    //     }
    //     if (!map.ContainsKey(nums[i])){
    //         map.Add(nums[i], i);
    //     }
    // }
    // return new int[]{};

    // var map = new Dictionary<int, int>();
    // for (int i = 0; i < nums.Length; i++)
    //     if (map.TryGetValue(target - nums[i], out var j))
    //         return new[] { j, i };
    //     else
    //         map[nums[i]] = i;

    // return Array.Empty<int>();

     Dictionary<int, int> map = new Dictionary<int, int>();

    for(int i = 0; i < nums.Length; i++) {
        int complement = target - nums[i];
        if(map.ContainsKey(complement)) {
            return new int[] { map[complement], i };
        }
        map[nums[i]] = i;
    }
    return new int[] { };
  }
}

// Ejemplo: programa con Main para probar Two Sum
class Program
{
    static void Main(string[] args)
    {
        var solution = new Solution();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = solution.TwoSum(nums, target);
        System.Console.WriteLine($"[{result[0]}, {result[1]}]"); // [0, 1]
    }
}