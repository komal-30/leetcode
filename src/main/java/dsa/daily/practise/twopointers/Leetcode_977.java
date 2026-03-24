package dsa.daily.practise.twopointers;

import java.util.Arrays;

public class Leetcode_977 {
    public int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(x -> x * x).sorted().toArray();
    }

}
