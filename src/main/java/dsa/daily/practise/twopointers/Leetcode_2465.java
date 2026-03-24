package dsa.daily.practise.twopointers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Leetcode_2465 {
    public int distinctAverages(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int start = 0;
        int end = nums.length - 1;

        Arrays.sort(nums);

        while (start < end) {
            // double avg = (nums[start] + nums[end] )/2.0;
            set.add(nums[start] + nums[end]);
            start++;
            end--;
        }

        return set.size();

    }

}
