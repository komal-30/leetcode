package dsa.daily.practise.twopointers;

public class Leetcode_28 {

    public static int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        int hayStackLength = haystack.length();

        for (int i = 0; i <= hayStackLength - needleLength; i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("leetcode", "leeto"));

    }

}
