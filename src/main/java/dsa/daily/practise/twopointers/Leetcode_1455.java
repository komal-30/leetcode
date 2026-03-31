package dsa.daily.practise.twopointers;

public class Leetcode_1455 {

    public int isPrefixOfWord(String sentence, String searchWord) {

        String[] newList = sentence.strip().split(" ");

        for (int i = 0; i < newList.length; i++) {
            if (newList[i].length() >= searchWord.length()) {
                int start = 0;
                int end = searchWord.length();

                while (start < end) {
                    if (newList[i].charAt(start) == searchWord.charAt(start))
                        start++;
                    else
                        break;
                }

                if (start >= end)
                    return i;
            }

        }

        return -1;

    }

}
