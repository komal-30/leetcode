package dsa.daily.practise.twopointers;

public class Leetcode_3750 {

    public int minimumFlips(int n) {

        /*
         * String s = Long.toBinaryString(n);
         * int len = s.length();
         * int count = 0;
         * for(int i = 0; i < len; i++) {
         * if(s.charAt(i) != s.charAt(len - 1 - i)) count++;
         * }
         * return count;
         * }
         * }
         */

        int count = 0;
        int start = 0;
        String binary = Integer.toBinaryString(n); // Built-in method
        int end = binary.length() - 1;

        while (start < binary.length() && end >= 0) {
            int x = (binary.charAt(start) - '0') ^ (binary.charAt(end) - '0');
            if (x == 1)
                count += 1;
            start++;
            end--;

        }

        return count;

    }

}
