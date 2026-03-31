package dsa.daily.practise.twopointers;

public class Leetcodee_1385 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int maxValue = Integer.MIN_VALUE;
        int count = 0;
        for (int n : arr2) {
            maxValue = Math.max(maxValue, n);
        }

        for (int n : arr1) {
            if (Math.abs(n - maxValue) > d)
                count++;
        }
        return count;
    }

}
