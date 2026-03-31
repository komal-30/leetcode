package dsa.daily.practise.twopointers;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_2570 {

    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> answerList = new ArrayList<>();

        int firstPointer = 0;
        int secondPointer = 0;

        while (firstPointer < nums1.length && secondPointer < nums2.length) {

            if (nums1[firstPointer][0] == nums2[secondPointer][0]) {
                int sumValue = nums1[firstPointer][1] + nums2[secondPointer][1];
                answerList.add(new int[] { nums1[firstPointer][0], sumValue });
                firstPointer++;
                secondPointer++;
            }else if(nums1[firstPointer][0] < nums2[secondPointer][0]){
                answerList.add(nums1[firstPointer]);
                firstPointer++;
            }else{
                answerList.add(nums2[secondPointer]);
                secondPointer++;
            }

        }

        while(firstPointer < nums1.length){
            answerList.add(nums1[firstPointer]);
            firstPointer++;
        }

        while(secondPointer < nums2.length){
            answerList.add(nums2[secondPointer]);
            secondPointer++;

        }

        return answerList.toArray(new int[0][2]);

    }

    main

}
