package twoSum;

import java.util.HashMap;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int idx, elem, rem, rem_idx;

        // Iterate through each element in the array
        for(idx = 0; idx < nums.length; idx++) {
            // Current element
            elem = nums[idx];
            // Check if (target - elem) has already been encountered in the array
            rem = target - elem;

            if (hashMap.containsKey(rem)) {
                rem_idx = hashMap.get(rem);
                return new int[] {rem_idx, idx};
            }

            // Add the element and it's index to the array
            hashMap.put(elem, idx);
        }

        return null;
    }
}
