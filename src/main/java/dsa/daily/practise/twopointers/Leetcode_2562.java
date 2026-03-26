package dsa.daily.practise.twopointers;

public class Leetcode_2562 {

    public long findTheArrayConcVal(int[] nums) {

        long concatValue = 0;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            if (start == end)
                concatValue = concatValue + nums[start];
            else
                concatValue = concatValue + Integer.parseInt("" + nums[start] + nums[end]);
            start++;
            end--;
        }

        return concatValue;

    }

}
