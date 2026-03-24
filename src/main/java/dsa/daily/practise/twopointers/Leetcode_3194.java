package dsa.daily.practise.twopointers;

import java.util.Arrays;

public class Leetcode_3194 {

    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length;

        int result = Integer.MAX_VALUE;
        while (left < right) {
            result = Math.min(result, (nums[left] + nums[right]) / 2);
            left++;
            right--;
        }

        return result;

    }
}
