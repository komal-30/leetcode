package dsa.daily.practise.twopointers;

public class Leetcode_2903 {

    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {

        int fastPointer = indexDifference;
        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(i - fastPointer) >= fastPointer && Math.abs(nums[i] - nums[fastPointer]) >= valueDifference)
                return new int[] { i, fastPointer };
            else
                fastPointer++;

        }

        return new int[] { -1, -1 };
    }

}
