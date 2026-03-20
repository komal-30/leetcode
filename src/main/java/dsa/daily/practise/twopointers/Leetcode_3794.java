package dsa.daily.practise.twopointers;

class Leetcode_3794 {

    public String reversePrefix(String s, int k) {
        if (s == null || s.length() == 1)
            return s;
        int start = 0;
        int end = start + k - 1;
        char[] charStr = s.toCharArray();
        while (start < end) {
            char temp = charStr[start];
            charStr[start] = charStr[end];
            charStr[end] = temp;
            start++;
            end--;

        }
        return new String(charStr);
    }

    public static void main(String[] args) {

    }
}
