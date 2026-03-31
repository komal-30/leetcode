package dsa.daily.practise.twopointers;

public class Leetcode_2697 {

    public String makeSmallestPalindrome(String s) {
        int left = 0;
        int right = s.length();
        StringBuilder sb = new StringBuilder(s);

        while (left < right) {
            if (sb.charAt(right) < sb.charAt(left)) {
                sb.setCharAt(left, sb.charAt(right));
            } else {
                sb.setCharAt(right, sb.charAt(left));
            }

            left++;
            right--;

        }

        return new String(sb);

    }

}
