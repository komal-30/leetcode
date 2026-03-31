package dsa.daily.practise.twopointers;

public class Leetcode_1961 {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder res = new StringBuilder("");
        for (String word : words) {
            res.append(word);
            if (s.equals(res.toString()))
                return true;

        }

        return false;
    }

}
