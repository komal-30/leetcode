package dsa.daily.practise.twopointers;

import java.util.Arrays;

public class Leetcode_1385 {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        Arrays.sort(arr2);
        for (int elem : arr1) {
            if (check(elem, arr2, d))
                count++;

        }

        return count;

    }

    public boolean check(int elem, int[] arr2, int d) {

        int left = 0;
        int right = arr2.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (Math.abs(arr2[mid] - elem) <= d)
                return false;
            else if (arr2[mid] < elem)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return true;
    }

}
