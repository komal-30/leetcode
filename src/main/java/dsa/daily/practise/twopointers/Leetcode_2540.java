package dsa.daily.practise.twopointers;

public class Leetcode_2540 {

    public int getCommon(int[] nums1, int[] nums2) {

        // Set<Integer> set1 = new LinkedHashSet<>();
        // Set<Integer> set2 = new LinkedHashSet<>();

        // for(int n:nums1){
        // set1.add(n);
        // }

        // for(int n:nums2){
        // set2.add(n);
        // }

        // for(int i:set1){
        // if(set2.contains(i))
        // return i;

        // }

        // return -1;

        // }

        int pointer1 = 0;
        int pointer2 = 0;

        while (pointer1 < nums1.length && pointer2 < nums2.length) {

            if (nums1[pointer1] == nums2[pointer2])
                return nums1[pointer1];

            else if (nums1[pointer1] < nums2[pointer2])
                pointer1++;
            else
                pointer2++;

        }

        return -1;

    }

    public static void main(String[] args) {

    }

}
