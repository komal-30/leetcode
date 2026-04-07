package dsa.daily.practise.twopointers;

public class Leetcode_2460 {

    // //First Check the elements and multiple and replace with 0
    // for(int i= 0;i<nums.length-1;i++){
    // if(nums[i] == nums[i+1]){
    // nums[i] = nums[i]*2;
    // nums[i+1] = 0;
    // }

    // }

    // int shiftIndex = 0;
    // for(int elem:nums){
    // if(elem != 0){
    // nums[shiftIndex] = elem;
    // shiftIndex++;
    // }
    // }

    // //Shift All Zeros to End
    // while(shiftIndex < nums.length){
    // nums[shiftIndex] = 0;
    // shiftIndex++;
    // }

    // return nums;
    // }

    // TC = 0(N) , SC = O(1)
    public int[] applyOperations(int[] nums) {

        int n = nums.length;
        int index = 0;

        for (int i = 0; i < n; i++) {

            // Apply operation if same adjacent
            if (i < n - 1 && nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }

            // Move non-zero to front
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }

        return nums;
    }

}
