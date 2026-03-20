package dsa.daily.practise.twopointers;

public class Leetcode_557 {

    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        String[] strArray = s.split("\\s+");
        for (String word : strArray) {
            StringBuilder newWord = new StringBuilder();
            int n = word.length() - 1;
            while (n >= 0) {
                newWord.append(word.charAt(n));
                n--;
            }

            ans.append(newWord);
            ans.append(" ");

        }
        return new String(ans).stripTrailing();

    }

}
