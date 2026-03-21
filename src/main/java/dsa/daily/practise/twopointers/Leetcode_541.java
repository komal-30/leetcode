package dsa.daily.practise.twopointers;

public class Leetcode_541 {

    // Input: s = "abcdefg", k = 2
    // Output: "bacdfeg"

    public static String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        while (i < s.length()) {
            int start = i;
            // If the given string has less elements than k, reverse all the string elements
            int end = (i + k - 1) > s.length() - 1 ? s.length() - 1 : i + k - 1;

            while (start < end) {

                if (start <= s.length() && end <= s.length()) {
                    char temp = sb.charAt(start);
                    sb.setCharAt(start, sb.charAt(end));
                    sb.setCharAt(end, temp);

                    start++;
                    end--;
                } else
                    return new String(sb);

            }

            // Iterate with step size of 2k
            i = i + 2 * k;

        }
        return new String(sb);

    }

    // Optimized Approach = O(n),O(n)
    public static String reverseStrTwo(String s, int k) {

        char[] a = s.toCharArray();
        for (int start = 0; start < a.length; start += 2 * k) {
            int i = start, j = Math.min(start + k - 1, a.length - 1);
            while (i < j) {
                char tmp = a[i];
                a[i++] = a[j];
                a[j--] = tmp;
            }
        }
        return new String(a);
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcd", 2));

    }

}