package dsa.daily.practise.twopointers;

public class Leetcode_1768 {

    public String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();
        int commonPointer = Math.min(word1.length(), word2.length());
        for (int i = 0; i < commonPointer; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        return sb.toString() + (word2.length() > word1.length() ? word2.substring(commonPointer)
                : word1.substring(commonPointer));

    }

}
