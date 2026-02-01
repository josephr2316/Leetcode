package Java;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap; 
import java.util.List;
import java.util.ListIterator;
import java.util.Comparator;
import java.util.ArrayList;


class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] result = new int[2]; // how to declare an array in java
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target)
        //             return new int[] { i, j };
        //     }
        // }
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     int complement = target -nums[i];
        //     if (map.containsKey(complement))
        //         return new int[] { map.get(complement), i };
        //     map.put(nums[i], i); 
        // }

        // List<int[]> pairs = new ArrayList<>();
        // for (int i = 0; i < nums.length; i++) {
        //     pairs.add(new int[]{nums[i], i});
        // }

        // // 2. Sort by the value (the first element in each pair)
        // pairs.sort(Comparator.comparingInt(a -> a[0]));

        // // 3. Create two ListIterators: one starting at the beginning, one at the end
        // ListIterator<int[]> leftIt = pairs.listIterator();          // starts "before" index 0
        // ListIterator<int[]> rightIt = pairs.listIterator(pairs.size()); // starts "after" the last index

        // // 4. While the "left pointer" has not crossed the "right pointer"
        // while (leftIt.nextIndex() < rightIt.previousIndex()) {
        //     // Get the current left and right pair (without actually moving the iterators yet)
        //     int leftIdx = leftIt.nextIndex();         // Next call to leftIt.next() would give this index
        //     int rightIdx = rightIt.previousIndex();   // Next call to rightIt.previous() would give this index

        //     int[] leftPair = pairs.get(leftIdx);
        //     int[] rightPair = pairs.get(rightIdx);

        //     int sum = leftPair[0] + rightPair[0];
        //     if (sum == target) {
        //         // Return their original indices
        //         return new int[]{leftPair[1], rightPair[1]};
        //     } else if (sum < target) {
        //         // Move the left iterator forward one step
        //         leftIt.next();
        //     } else {
        //         // Move the right iterator backward one step
        //         rightIt.previous();
        //     }
        // }


        // int n = nums.length;
        // int[][] arr = new int[n][2];

        // for (int i = 0; i < n; i++) {
        //     arr[i][0] = nums[i]; // valor
        //     arr[i][1] = i;       // índice original
        // }

        // Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

        // int l = 0, r = n - 1;
        // while (l < r) {
        //     int sum = arr[l][0] + arr[r][0];
        //     if (sum == target)
        //         return new int[] { arr[l][1], arr[r][1] };
        //     if (sum < target) l++;
        //     else r--;
        // }

        // TreeMap<Integer, Integer> map = new TreeMap<>();

        // for (int i = 0; i < nums.length; i++) {
        //     int need = target - nums[i];
        //     if (map.containsKey(need))
        //         return new int[] { map.get(need), i };
        //     map.put(nums[i], i);
        // }

        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }
        // throw new IllegalArgumentException("No two sum solution");
        return new int[] {}; // return null.

    }

    public static void main(String[] args) { 
        Solution solution = new Solution();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}