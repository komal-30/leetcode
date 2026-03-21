package dsa.daily.practise.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode_350 {

    // Using Map
    public int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> resultList = new ArrayList<>();
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        for (int num : nums1) {
            elementCountMap.put(num, elementCountMap.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (elementCountMap.get(num) != null && elementCountMap.get(num) > 0) {
                resultList.add(num);
                elementCountMap.put(num, elementCountMap.get(num) - 1);
            }
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();

    }

    // If Arrays are sorted then two pointer
    public static int[] intersectTwo(int[] nums1, int[] nums2) {

        List<Integer> resultList = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int nums1Start = 0;
        int nums2Start = 0;

        int nums1Length = nums1.length;
        int nums2Length = nums2.length;

        while (nums1Start < nums1Length && nums2Start < nums2Length) {

            if (nums1[nums1Start] == nums2[nums2Start]) {
                resultList.add(nums1[nums1Start]);
                nums1Start++;
                nums2Start++;
            } else if (nums1[nums1Start] < nums2[nums2Start])
                nums1Start++;
            else
                nums2Start++;
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();

    }

    public static void main(String[] args) {

        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };

        int[] ans = intersectTwo(nums1, nums2);
        for (int i : ans) {
            System.out.println(i);

        }

    }

}
