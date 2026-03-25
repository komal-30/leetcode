package dsa.daily.practise.twopointers;

import java.util.HashSet;
import java.util.Set;

public class Leetcode_1346 {
    public static boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<Integer>();
        for (int number : arr) {
            if (set.contains(number * 2) || (number % 2 == 0 && set.contains(number / 2)))
                return true;
            else
                set.add(number);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 2, 5, 3 };
        System.out.println(checkIfExist(arr));
    }

}
