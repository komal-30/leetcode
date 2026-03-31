package dsa.daily.practise.twopointers;

public class Leetcode_821 {

    public static int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];

        int prev = -10000; // very small number

        // Left to right
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            ans[i] = i - prev;
        }

        prev = 10000; // very large number

        // Right to left
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            ans[i] = Math.min(ans[i], prev - i);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] ans = shortestToChar("loveleetcode", 'e');
        System.out.println(ans[0] + " " + ans[1]);
    }

}
