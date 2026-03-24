package dsa.daily.practise.twopointers;

public class Leetcode_1332 {

    public int removePalindromeSub(String s) {

        // Check if the string is null
        if (s.isBlank())
            return 0;

        StringBuilder sb = new StringBuilder(s);
        // Check if str and rev are equal then return 1
        if (s.equals(sb.reverse().toString()))
            return 1;

        // If not , than we can use 1 operation to remove all a's and 1 operation to
        // remove all b's
        else
            return 2;

    }

}
