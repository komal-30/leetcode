package dsa.daily.practise.twopointers;

public class Leetcode_2108 {

    public String firstPalindrome(String[] words) {
        for (String word : words) {
            int start = 0;
            int end = word.length() - 1;
            char[] charArray = word.toCharArray();
            boolean isPal = true;
            while (start < end) {
                if (charArray[start] != charArray[end]) {
                    isPal = false;
                    break;
                }
                start++;
                end--;
            }

            if (isPal)
                return word;

        }

        return "";

    }

}
