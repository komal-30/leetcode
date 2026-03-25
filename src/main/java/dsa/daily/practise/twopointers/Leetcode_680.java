package dsa.daily.practise.twopointers;

public class Leetcode_680 {

    public boolean validPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return checkPalindrome(s.substring(left + 1, right + 1)) || checkPalindrome(s.substring(left, right));

            left++;
            right--;
        }
        return true;

    }

    public static boolean checkPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;

    }

}
