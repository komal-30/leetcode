package dsa.daily.practise.twopointers;

import java.util.Arrays;

public class Leetcode_2441 {

    public int findMaxK(int[] nums) {
        Arrays.sort(nums); // ascending
        int start = 0;
        int end = nums.length - 1;
        int maxK = -1;

        while (start < end) {
            int sum = nums[start] + nums[end];

            if (sum == 0) {
                maxK = Math.max(maxK, nums[end]); // nums[end] > 0
                start++;
                end--;
            } else if (sum < 0) {
                start++;
            } else {
                end--;
            }
        }

        return maxK;

    }

}
