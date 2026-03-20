package dsa.daily.practise.twopointers;

public class Leetcode_2000 {
    public String reversePrefix(String word, char ch) {
        int firstOccurenceIndex = word.indexOf(ch);
        if (firstOccurenceIndex == -1)
            return word;
        int start = 0;
        int end = firstOccurenceIndex;

        char[] charStr = word.toCharArray();
        while (start < end) {
            char temp = charStr[start];
            charStr[start] = charStr[end];
            charStr[end] = temp;
            start++;
            end--;
        }
        return new String(charStr);
    }

}