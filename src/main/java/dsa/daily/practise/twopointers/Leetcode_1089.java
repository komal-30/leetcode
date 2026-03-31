package dsa.daily.practise.twopointers;

public class Leetcode_1089 {

    public static void duplicateZeros(int[] arr) {
        int temp = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == 0 && arr[i - 1] != 0)
                flag = false;
            if (arr[i] == 0 && flag != true) {
                temp = arr[i + 1];
                arr[i + 1] = 0;
                flag = true;
            } else if (arr[i] != 0 && i != 0) {
                int temp1 = arr[i];
                arr[i] = temp;
                temp = temp1;
            }
        }
        for (int n : arr)
            System.out.println(n);

    }
    /*
     * [1,0,2,3,0,4,5,0]
     * Output: [1,0,0,2,3,0,0,4]
     */

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);
    }

}
