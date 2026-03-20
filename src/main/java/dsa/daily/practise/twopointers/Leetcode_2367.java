package dsa.daily.practise.twopointers;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_2367 {

    public int arithmeticTriplets(int[] nums, int diff) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            numIndexMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {

            if (numIndexMap.containsKey(nums[i] + diff) && numIndexMap.containsKey(nums[i] + 2 * diff))
                count++;
        }

        return count;

    }

}
