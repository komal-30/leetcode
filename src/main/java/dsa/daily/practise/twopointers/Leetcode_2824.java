package dsa.daily.practise.twopointers;

import java.util.Collections;
import java.util.List;

class Leetcode_2824 {

    // Solution 1 = n2,1
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target)
                    count += 1;
            }
        }

        return count;

    }

    // Solution 2 = n2,1
    public int countPairs2(List<Integer> nums, int target) {
        int count = 0;
        Collections.sort(nums);

        int left = 0;
        int right = nums.size() - 1;

        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                count = count + (right - left);
                left++;
            } else
                right--;
        }

        return count;

    }

    public static void main(String[] args) {

    }

}